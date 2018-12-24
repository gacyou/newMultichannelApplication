package com.newmultichannel.app.Parser;

import com.newmultichannel.app.bean.ad;

public class AdParser  extends DataParser<ad> {
    @Override
    protected Class<ad> getType() {
        return ad.class;
    }
}
