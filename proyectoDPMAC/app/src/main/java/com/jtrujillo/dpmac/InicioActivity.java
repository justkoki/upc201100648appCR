package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity {

    Button btnRegistrarsePorPerfil, btnLoginPorPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnRegistrarsePorPerfil = (Button)findViewById(R.id.btnRegistrarsePorPerfil);
        btnRegistrarsePorPerfil.setOnClickListener(v -> {
            Intent i = new Intent(this, RegistroPerfilActivity.class);
            startActivity(i);
        });

        btnLoginPorPerfil = (Button)findViewById(R.id.btnLoginPorPerfil);
        btnLoginPorPerfil.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginPerfilActivity.class);
            startActivity(i);
        });
    }
}