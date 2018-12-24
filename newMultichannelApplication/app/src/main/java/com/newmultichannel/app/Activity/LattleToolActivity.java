package com.newmultichannel.app.Activity;

import android.app.Fragment;
import android.os.Bundle;

import com.ga.sdk.activity.BaseActivity;
import com.newmultichannel.app.Fragment.LattleToolFragment;

public class LattleToolActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.createFrameLayout();

    }

    @Override
    protected Fragment newFragment() { return new LattleToolFragment(); }
}
