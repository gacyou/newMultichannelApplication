package com.newmultichannel.app.Api;

import com.ga.sdk.api.Params;
import com.newmultichannel.app.base.BaseApi;

public class OtherApi extends BaseApi {

    private static final String ADURL = "/init/zhanpu/ios/iosapp9/102";

    public String getAdUrl() throws Exception {
        Params params = new Params();

        return this.doGet(ADURL, params.getMap());
    }
}
