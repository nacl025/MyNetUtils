package stone.com.mynetutils.test;

import android.annotation.SuppressLint;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.util.Xml;

import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by edmund on 2017/7/21.
 */
public abstract class Request {
    protected Context context;
    protected RequestInfo requestInfo;
    public XmlSerializer serializer = Xml.newSerializer();
    public StringWriter requestBuffer;
    private int command;

    public Request(RequestInfo requestInfo, Context context) {
        this.requestInfo = requestInfo;
        this.context = context;

        requestBuffer = new StringWriter();
        try {
            serializer.setOutput(requestBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Request(Context context) {
        this.context = context;
        requestBuffer = new StringWriter();
        try {
            serializer.setOutput(requestBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public void addOperID() throws Exception {
        addOperID(false);
    }

    public void addOperID(boolean isUserGet) throws Exception {
        serializer.startTag(null, Env.XML_Tag_OperID);
        addTenantId(requestInfo);//多租户
        serializer.startTag(null, Env.XML_Tag_UID);
        if (!isUserGet && requestInfo.content.containsKey(Env.USER_ID_KEY)) {
            serializer.text(requestInfo.content.getAsString(Env.USER_ID_KEY));
        } else {
            serializer.text("");
        }
        serializer.endTag(null, Env.XML_Tag_UID);

        serializer.startTag(null, Env.XML_Tag_FlowNum);
        if (requestInfo.content.containsKey(Env.FLOW_NUM_KEY)) {
            serializer.text(requestInfo.content.getAsString(Env.FLOW_NUM_KEY) + "");
        } else {
            serializer.text("");
        }
        serializer.endTag(null, Env.XML_Tag_FlowNum);

        serializer.startTag(null, Env.XML_Tag_Timezone);
        serializer.text(getUnknown() + "");
        serializer.endTag(null, Env.XML_Tag_Timezone);

        serializer.startTag(null, Env.XML_Tag_Result);
        serializer.text(getUnknown() + "");
        serializer.endTag(null, Env.XML_Tag_Result);

        serializer.endTag(null, Env.XML_Tag_OperID);
    }

    public String getUnknown() {
        return Env.DEFAULT_VALUE + "";
    }


    //租户号
    private void addTenantId(RequestInfo requestInfo) throws IOException {
        serializer.startTag(null, Env.XML_TAG_TenantID);
        if (requestInfo.content.containsKey(Env.XML_TAG_TenantID)) {
            serializer.text(requestInfo.content.getAsString(Env.XML_TAG_TenantID) + "");
        } else {
            String tenantID = "0001_10";
            serializer.text(tenantID + "");
        }
        serializer.endTag(null, Env.XML_TAG_TenantID);
    }

    public void addXmlHead() throws Exception {
        serializer.startDocument("UTF-8", null);
        serializer.startTag(null, Env.XML_Tag_Request);
    }

    public void addXmlEnd() throws Exception {
        serializer.endTag(null, Env.XML_Tag_Request);
        serializer.endDocument();
    }

    public abstract String getRequestXML();

    /**
     * 增加简单的标签
     *
     * @param cv
     * @param tagName
     * @throws Exception
     */
    protected void addTagSimple(ContentValues cv, String tagName) throws Exception {
        serializer.startTag(null, tagName);
        if (cv.containsKey(tagName) && cv.getAsString(tagName) != null) {
            serializer.text(cv.getAsString(tagName));
        } else {
            serializer.text("");
        }
        serializer.endTag(null, tagName);
    }

}
