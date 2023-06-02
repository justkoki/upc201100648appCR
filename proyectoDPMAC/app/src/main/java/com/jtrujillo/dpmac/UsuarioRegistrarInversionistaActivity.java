package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UsuarioRegistrarInversionistaActivity extends AppCompatActivity {

    Button btnRegistrarse;

    TextView txtLoginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_registrar_inversionista);

        btnRegistrarse = (Button)findViewById(R.id.btnRegistrarse);
        btnRegistrarse.setOnClickListener(v -> {
            Intent i = new Intent(this, UsuarioLoginInversionistaActivity.class);
            startActivity(i);
        });

        txtLoginLink = (TextView)findViewById(R.id.txtLoginLink);
        txtLoginLink.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginPerfilActivity.class);
            startActivity(i);
        });
    }
}