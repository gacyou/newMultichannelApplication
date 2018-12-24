package com.newmultichannel.app.Parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseParser {
    protected static Gson gson() {
        return new GsonBuilder().create();
    }
}
