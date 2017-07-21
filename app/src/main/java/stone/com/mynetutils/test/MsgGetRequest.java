package stone.com.mynetutils.test;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

/**
 * Created by edmund on 2017/7/21.
 */
public class MsgGetRequest extends Request {

    public MsgGetRequest(int command, RequestInfo requestInfo, Context context) {
        super(requestInfo, context);// 调用父类的构造函数
        super.setCommand(command);
    }

    @Override
    public String getRequestXML() {
        try {
            this.addXmlHead();
            this.addOperID();
            addMessage();
            this.addXmlEnd();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        Log.i("MsgGetRequest", requestBuffer.toString());
        return requestBuffer.toString();
    }

    private void addMessage() throws Exception {
        ContentValues cv = requestInfo.content;
        serializer.startTag(null, Env.XML_Tag_Message);
        addTagSimple(cv, Env.XML_Tag_MessageStatus);
        addTagSimple(cv, Env.XML_Tag_RowNum);
        addTagSimple(cv, Env.XML_Tag_MaxId);
        addTagSimple(cv, Env.XML_Tag_MinId);
        addTagSimple(cv, Env.XML_Tag_MessgeType);
        serializer.endTag(null, Env.XML_Tag_Message);

    }
}