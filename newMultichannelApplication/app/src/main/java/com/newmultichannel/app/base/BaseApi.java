package com.newmultichannel.app.base;

import android.content.Context;
import android.text.TextUtils;

import com.ga.sdk.api.AbstractBaseApi;
import com.newmultichannel.app.BuildConfig;

import java.util.HashMap;
import java.util.Map;

public class BaseApi extends AbstractBaseApi {
    @Override
    protected Map<String, String> getHeader() {
        Map<String, String> headers = null;

        if (!TextUtils.isEmpty(this.accessToken)) {
            headers = new HashMap<>();
            headers.put("Authorization", this.accessToken);
        }

        return headers;
    }

    @Override
    protected String getAccessToken(Context context) { return ""; }

    @Override
    protected String toUrl(String path) {
        return BuildConfig.API_URL + path;
    }

}