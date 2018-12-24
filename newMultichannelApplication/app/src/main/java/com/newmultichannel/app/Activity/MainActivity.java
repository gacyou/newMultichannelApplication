package com.newmultichannel.app.Activity;

import android.app.Fragment;
import android.content.Loader;
import android.os.Bundle;
import android.util.Log;

import com.ga.sdk.activity.BaseActivity;
import com.ga.sdk.api.ApiResult;
import com.newmultichannel.app.Common.CommonIntent;
import com.newmultichannel.app.Fragment.MainFragment;
import com.newmultichannel.app.Loader.GetAdLoader;
import com.newmultichannel.app.base.ApiLoaderCallback;
import com.newmultichannel.app.bean.ad;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.createFrameLayout();

        ApiLoaderCallback.startApiLoader(this, ADApiLoaderCallback);
    }

    @Override
    protected Fragment newFragment() { return new MainFragment(); }


    ApiLoaderCallback<ad> ADApiLoaderCallback = new ApiLoaderCallback<ad>() {
        @Override
        public Loader<ApiResult<ad>> onCreateLoader(int id, Bundle args) {
            return new GetAdLoader(MainActivity.this);
        }

        @Override
        protected void onStatusOk(ad data) {
            startActivity(CommonIntent.createLattleToolActivity(MainActivity.this, data.getH5()));
        }
    };
}
