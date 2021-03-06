package com.newmultichannel.app.base;

import android.content.Context;
import android.content.Loader;
import android.os.Bundle;

import com.ga.sdk.api.ApiResult;
import com.ga.sdk.loader.AbstractApiLoaderCallback;
import com.orhanobut.logger.Logger;
import com.newmultichannel.app.bean.ad;

import org.json.JSONException;

public abstract class ApiLoaderCallback<T> extends AbstractApiLoaderCallback<T> {

    @Override
    protected String toErrorMessage(ApiResult apiResult) {

        String message;
        try {
            message = BaseApiParser.getMessage(apiResult.getError().getBody());
        } catch (JSONException e) {
            int status = apiResult.getError().getStatus();
            String reason = apiResult.getError().getReason();

            message = "[" + status + "] " + reason;
        }

        return message;
    }

    @Override
    protected void handleForbidden(Context context) {
        try {

        } catch (Exception e) {
            Logger.e(e, e.getMessage());
        }
    }
}