package com.newmultichannel.app.Loader;

import android.content.Context;
import android.support.annotation.NonNull;

import com.ga.sdk.loader.BaseAsyncTaskLoader;
import com.newmultichannel.app.Api.OtherApi;
import com.newmultichannel.app.Parser.AdParser;
import com.newmultichannel.app.bean.ad;

public class GetAdLoader extends BaseAsyncTaskLoader<ad> {

    public GetAdLoader(@NonNull Context context) {
        super(context);
    }

    @Override
    protected String action() throws Exception {
        OtherApi otherApi = new OtherApi();
        return otherApi.getAdUrl();
    }

    @Override
    protected ad parseData(String s) throws Exception {
        AdParser parser = new AdParser();
        return parser.toData(s);
    }
}
