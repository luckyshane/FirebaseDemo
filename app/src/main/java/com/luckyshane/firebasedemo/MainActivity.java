package com.luckyshane.firebasedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle data = getIntent().getExtras();
        if (data != null) {
            Log.d(TAG, "bundle: " + BundleHelper.getJson(data));
        }
    }




}
