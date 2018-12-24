package com.newmultichannel.app.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ad implements Serializable {

    @SerializedName("h5Page")
    private String h5;

    public String getH5() { return h5; }
}
