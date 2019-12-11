package com.onboardapp.ui.splash;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.onboardapp.MyApp;
import com.onboardapp.R;
import com.onboardapp.data.PreferenceHelper;
import com.onboardapp.ui.main.MainActivity;
import com.onboardapp.ui.onboard.OnBoardActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        selectActivity();

    }

    private void selectActivity() {


        if (PreferenceHelper.getIsFirstLaunch()) {

        }else {
            OnBoardActivity.start(this);

            // MainActivity.start(this);

        }
        finish();
    }
}
