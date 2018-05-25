package com.luckyshane.firebasedemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = new View(this);
        view.setBackgroundColor(Color.RED);
        setContentView(view);

        Log.d(TAG, "onCreate: " + getIntent());
        Bundle data = getIntent().getExtras();
        if (data != null) {
            Log.d(TAG, "bundle: " + BundleHelper.getJson(data));
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }


}
