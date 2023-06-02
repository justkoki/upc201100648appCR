package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPerfilActivity extends AppCompatActivity {

    Button btnRegistrarseLoginPerfil, btnRegresarLoginPerfil, btnLoginPrestatario, btnLoginInversor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_perfil);

        btnLoginPrestatario = (Button)findViewById(R.id.btnLoginPrestatario);
        btnLoginPrestatario.setOnClickListener(v -> {
            Intent i = new Intent(this, UsuarioLoginSolicitanteActivity.class);
            startActivity(i);
        });

        btnLoginInversor = (Button)findViewById(R.id.btnLoginInversor);
        btnLoginInversor.setOnClickListener(v -> {
            Intent i = new Intent(this, UsuarioLoginInversionistaActivity.class);
            startActivity(i);
        });

        btnRegistrarseLoginPerfil = (Button)findViewById(R.id.btnRegistrarseLoginPerfil);
        btnRegistrarseLoginPerfil.setOnClickListener(v -> {
            Intent i = new Intent(this, RegistroPerfilActivity.class);
            startActivity(i);
        });

        btnRegresarLoginPerfil = (Button)findViewById(R.id.btnRegresarLoginPerfil);
        btnRegresarLoginPerfil.setOnClickListener(v -> {
            Intent i = new Intent(this, InicioActivity.class);
            startActivity(i);
        });
    }
}