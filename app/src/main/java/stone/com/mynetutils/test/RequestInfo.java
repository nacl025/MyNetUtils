package stone.com.mynetutils.test;

import android.content.ContentValues;

/**
 * Created by edmund on 2017/7/21.
 */
public class RequestInfo {
    public ContentValues content = null;

    public RequestInfo() {
        content = new ContentValues();
    }

    public RequestInfo(ContentValues content) {
        this.content = content;
    }
}
