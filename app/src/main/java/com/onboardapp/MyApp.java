package com.onboardapp;

import android.app.Application;

import com.onboardapp.data.PreferenceHelper;


public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
         PreferenceHelper.init(this);
    }
}
