package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeSolicitanteActivity extends AppCompatActivity {
    Handler oHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_solicitante);

        oHandler = new Handler();
        oHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(WelcomeSolicitanteActivity.this, MenuSolicitanteActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}