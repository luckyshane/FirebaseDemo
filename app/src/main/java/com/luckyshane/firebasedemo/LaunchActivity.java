package com.luckyshane.firebasedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class LaunchActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle data = getIntent().getExtras();
        if (data != null) {
            Log.d(TAG, "bundle: " + BundleHelper.getJson(data));
            if (data.containsKey("key1")) {
                startActivity(new Intent(this, MainActivity.class));
                finish();
                return;
            }
        }
        startActivity(new Intent(this, SplashActivity.class));
        finish();
    }





}
