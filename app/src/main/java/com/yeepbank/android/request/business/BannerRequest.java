package com.yeepbank.android.request.business;

import android.content.Context;
import com.yeepbank.android.Cst;
import com.yeepbank.android.http.BaseRequest;
import com.yeepbank.android.http.StringListener;

import java.util.Map;

/**
 * Created by WW on 2015/11/19.
 */
public class BannerRequest extends BaseRequest {

    public BannerRequest(Context context, StringListener stringListener) {
        super(context, stringListener);
    }

    @Override
    protected String getUrl() {
        return Cst.URL.BANNER_URL;
    }

    @Override
    protected int getMethod() {
        return METHOD_GET;
    }

    @Override
    protected Map<String, String> getParams() {
        return null;
    }

    public void stringRequest(){
        super.stringRequest();
    }
}
