package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

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
                Bundle bndDatos = new Bundle();
                bndDatos.putInt("idUsuarioTipo", 3);

                Intent i = new Intent(WelcomeInversionistaActivity.this, MenuInversionistaActivity.class);
                //Intent i = new Intent(WelcomeInversionistaActivity.this, MainActivity.class);
                i.putExtras(bndDatos);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}