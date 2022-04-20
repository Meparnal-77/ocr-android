package com.example.androidocr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.androidocr.R;

public class SplashActivity extends Activity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
                                      @Override public void run() {
                                          Intent i = new Intent(SplashActivity.this, com.example.androidocr.MainActivity.class); startActivity(i);
                                          finish();
                                      }
                                  },
                1500);

    }
}