package stone.com.mynetutils.netutils;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.net.ProtocolException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/**
 * Created by edmund on 2017/7/21.
 */
public class HttpURLConnectionUtils {

    private static final String TAG = "HttpURLConnectionUtils";
    private static int NET_BUFFER_SIZE = 512;
    private static int NET_MAX_SIZE = 1024 * 1024 * 10;
    private byte[] requestbytes;
    private byte[] responseBytes;
    private boolean finish = false;
    private boolean success = false;
    private URL url;
    private boolean cancel;
    private String requestMethod = "POST";
    // private String contentType = "application/octet-stream";
    private String contentType = null;

    public HttpURLConnectionUtils(URL url, byte[] requestBytes){
        this.url = url;
        this.requestbytes = requestBytes;
    }

    public void setContent_type(String contentType) {
        this.contentType = contentType;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isFinish() {
        return this.finish;
    }

    public void reset() {
        this.finish = false;
        this.success = false;
        this.cancel = false;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public void sendRequest(Context context) {
        HttpURLConnection httpCon = null;
        Log.i(TAG, "url#" + url.toString());
        try {
            trustAllHttpsCertificates();
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
            httpCon = (HttpURLConnection) url.openConnection();

            initHttpRequestHeader(httpCon);
            sendData2Server(httpCon);
            int responseCode = httpCon.getResponseCode();
            Log.i(TAG, "responseCode:" + responseCode);
            responseBytes = this.getDataFromServer(httpCon);
            this.success = true; // 传输成功
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "sendRequest error:" + e.getMessage());
            this.success = false; // 传输失败
        } finally {
            this.finish = true; // 传输完成，无论成功与失败。
            if (httpCon != null) {
                httpCon.disconnect(); // 释放http连接。
                httpCon = null;
            }
            notify();
        }
    }

    private void sendData2Server(HttpURLConnection httpCon) throws IOException {
        // 判断是否有数据需要发送到服务器，如果需要发送数据的话，判读用户此时是否已经取消本次联网。
        if (requestbytes != null && !this.cancel) {
            OutputStream os = httpCon.getOutputStream();
            ByteArrayInputStream bin = new ByteArrayInputStream(requestbytes);
            byte buffer[] = new byte[NET_BUFFER_SIZE];
            int bytesRead = 0;
            while ((bytesRead = bin.read(buffer, 0, NET_BUFFER_SIZE)) != -1) {
                if (this.cancel) { // 在向服务器发送数据时，判断用户此时是否取消联网。
                    break;
                }
                os.write(buffer, 0, bytesRead);
                os.flush();
            }
            bin.close();
            os.close();
        }
    }

    private byte[] getDataFromServer(HttpURLConnection httpCon) throws Exception {
        if (!this.cancel) { // 判断是否在从服务器获得数据之前，用户已经取消本次联网请求。
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            InputStream is = new BufferedInputStream(httpCon.getInputStream());
            long totalcount = httpCon.getContentLength();
            Log.i(TAG, "responseLen#" + totalcount);
            int bytesRead = 0;
            int sum = 0;
            byte buffer[] = new byte[NET_BUFFER_SIZE];
            while ((bytesRead = is.read(buffer, 0, NET_BUFFER_SIZE)) != -1) {
                if (this.cancel) { // 判断是否在从服务器读取数据的时候，用户取消本次联网请求。
                    break;
                }
                bao.write(buffer, 0, bytesRead);
                sum += bytesRead;
                if (sum >= NET_MAX_SIZE) {
                    break;
                }
            }
            is.close();
            byte[] responseBytes = bao.toByteArray();
            StringBuffer strbuffer = new StringBuffer();
            if (responseBytes.length > 0)
                for (int i = 0; i < 16; i++) {
                    strbuffer.append("[" + responseBytes[i] + "] ");
                }
            Log.i(TAG, "reponseBody:" + bao.toString());
            return bao.toByteArray();
        } else {
            return null;
        }
    }

    public byte[] getResponseBytes() {
        while (!this.finish) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
        if (!this.cancel && this.success && responseBytes != null && responseBytes.length > 0) {
            return responseBytes;
        } else {
            return null;
        }
    }

    private void initHttpRequestHeader(HttpURLConnection httpCon) throws ProtocolException {
        httpCon.setDoOutput(true);
        httpCon.setDoInput(true);
        httpCon.setUseCaches(false);
        httpCon.setUseCaches(false);
        httpCon.setInstanceFollowRedirects(true);
        httpCon.setRequestProperty("Accept", "*/*");
        httpCon.setRequestProperty("Connection", "keep-alive");
        if (!TextUtils.isEmpty(contentType))
            httpCon.setRequestProperty("Content-type", contentType);
        httpCon.setRequestMethod("POST");
        httpCon.setConnectTimeout(30000);
        httpCon.setReadTimeout(90000);
        // if (!this.range.equals(""))
        // httpCon.setRequestProperty("Range", range);
    }

    private static void trustAllHttpsCertificates() throws Exception {
        // Create a trust manager that does not validate certificate chains:
        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];

        javax.net.ssl.TrustManager tm = new miTM();

        trustAllCerts[0] = tm;

        javax.net.ssl.SSLContext sc = null;

        try {
            sc = javax.net.ssl.SSLContext.getInstance("SSL");
        } catch (Exception e) {
            // e.printStackTrace();
            Log.d(TAG, "不支持SSL，准备使用TLS");
            sc = javax.net.ssl.SSLContext.getInstance("TLS");
        }

        sc.init(null, trustAllCerts, null);

        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

    public static class miTM implements javax.net.ssl.TrustManager, javax.net.ssl.X509TrustManager {
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public boolean isServerTrusted(java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public boolean isClientTrusted(java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }

        public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }
    }

    HostnameVerifier hv = new HostnameVerifier() {
        public boolean verify(String urlHostName, SSLSession session) {
            return true;
        }
    };

    // 转换下载文件大小格式
    private String getSize(long size) {
        double sizeN = size / 1024;
        DecimalFormat df = new DecimalFormat("#0.0");
        if (sizeN > 0 && sizeN < 1024) {
            return df.format(sizeN) + "k";
        } else if (sizeN >= 1024) {
            String s = df.format(sizeN / 1024);
            return s + "M";
        }
        return size + "b";
    }


}
