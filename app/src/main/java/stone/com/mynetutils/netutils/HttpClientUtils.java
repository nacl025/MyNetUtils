package stone.com.mynetutils.netutils;

import android.text.TextUtils;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by edmund on 2017/7/21.
 */
public class HttpClientUtils {

    private static final String TAG = "HttpClientUtils";
    private static int NET_BUFFER_SIZE = 512;
    private static int NET_MAX_SIZE = 1024 * 1024 * 10;
    private HttpClient hc = null;
    private byte[] requestBytes;
    private byte[] responseBytes;
    private boolean finish = false;
    private boolean success = false;
    private String url;
    private boolean cancel;
    private HttpPost httpPost;
    private String contentType = "application/x-www-form-urlencoded";

    private int currentResponseLength = 0;

    public HttpClientUtils(String url, byte[] requestBytes) {
        hc = new DefaultHttpClient();
        this.requestBytes = requestBytes;
        this.url = url;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
        if (httpPost != null) {
            httpPost.abort();
        }
    }

    public boolean isFinish() {
        return this.finish;
    }

    public void reset() {
        this.finish = false;
        this.success = false;
        this.cancel = false;
    }

    public void sendRequest() {
        httpPost = new HttpPost(url);
        Log.i(TAG, "url#" + url);
        try {
            initHttpRequestHeader(httpPost);
            HttpResponse res = sendData2Server(httpPost);
            HttpEntity entity = res.getEntity();
            if (res != null) {
                int statusCode = res.getStatusLine().getStatusCode();
                Log.i(TAG, "responseCode::" + statusCode);
                responseBytes = this.getDataFromServer(entity);
            }
            this.success = true; // 传输成功
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "sendRequest error:" + e.getMessage());
            Log.e(TAG, e.getStackTrace().toString());
            this.success = false; // 传输失败
        } finally {
            this.finish = true; // 传输完成，无论成功与失败。
            hc.getConnectionManager().shutdown();
        }
    }

    // 设置Http请求的Header字段的值
    private void initHttpRequestHeader(HttpPost httpPost)  {
        httpPost.addHeader("Accept", "*/*");
        httpPost.addHeader("Connection", "keep-alive");
        httpPost.addHeader("Cache-Control", "no-cache");
        httpPost.setHeader("Content-type", contentType);
        HttpParams hcParams = hc.getParams();
        HttpConnectionParams.setConnectionTimeout(hcParams, 30000);
        HttpConnectionParams.setSoTimeout(hcParams, 90000);

    }

    private HttpResponse sendData2Server(HttpPost httpPost) throws IOException {
        // 判断是否有数据需要发送到服务器，如果需要发送数据的话，判读用户此时是否已经取消本次联网。
        if (requestBytes != null && !this.cancel) {
            HttpEntity httpEntity = new ByteArrayEntity(requestBytes);
            httpPost.setEntity(httpEntity);
            HttpResponse res = hc.execute(httpPost);
            return res;
        }
        return null;
    }

    private byte[] getDataFromServer(HttpEntity entity) throws Exception {
        if (!this.cancel) { // 判断是否在从服务器获得数据之前，用户已经取消本次联网请求。
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            InputStream is = entity.getContent();
            int bytesRead;
            int sum = 0;
            byte buffer[] = new byte[NET_BUFFER_SIZE];
            while ((bytesRead = is.read(buffer, 0, NET_BUFFER_SIZE)) != -1) {
                this.currentResponseLength = this.currentResponseLength + bytesRead;
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
            StringBuffer strBuffer = new StringBuffer();
            if (responseBytes.length > 0)
                for (int i = 0; i < 16; i++) {
                    strBuffer.append("[" + responseBytes[i] + "] ");
                }
            Log.i(TAG, "response::" + bao.toString());
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

}
