package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeInversionistaActivity extends AppCompatActivity {
    Handler oHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_inversionista);

        oHandler = new Handler();
        oHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(WelcomeInversionistaActivity.this, MenuInversionistaActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}