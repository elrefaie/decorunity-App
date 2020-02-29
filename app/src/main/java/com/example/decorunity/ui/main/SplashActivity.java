package com.example.decorunity.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.decorunity.R;

public class SplashActivity extends AppCompatActivity {
    private static int splashTimeOut=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent firstActivity=new Intent(SplashActivity.this,FirstActivity.class);
                startActivity(firstActivity);
                finish();

            }
        },splashTimeOut);

    }
}
