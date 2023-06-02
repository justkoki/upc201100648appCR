package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jtrujillo.dpmac.ui.login.LoginActivity;

public class RegistroPerfilActivity extends AppCompatActivity {

    Button btnRegistrarPrestatario, btnRegistrarInversor, btnRegresarRegistroPerfil, btnLoginRegistroPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_perfil);

        btnRegistrarPrestatario = (Button)findViewById(R.id.btnRegistrarPrestatario);
        btnRegistrarPrestatario.setOnClickListener(v -> {
            Intent i = new Intent(this, UsuarioRegistrarSolicitanteActivity.class);
            startActivity(i);
        });

        btnRegistrarInversor = (Button)findViewById(R.id.btnRegistrarInversor);
        btnRegistrarInversor.setOnClickListener(v -> {
            Intent i = new Intent(this, UsuarioRegistrarInversionistaActivity.class);
            startActivity(i);
        });

        btnRegresarRegistroPerfil = (Button)findViewById(R.id.btnRegresarRegistroPerfil);
        btnRegresarRegistroPerfil.setOnClickListener(v -> {
            Intent i = new Intent(this, InicioActivity.class);
            startActivity(i);
        });

        btnLoginRegistroPerfil = (Button)findViewById(R.id.btnLoginRegistroPerfil);
        btnLoginRegistroPerfil.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginPerfilActivity.class);
            startActivity(i);
        });
    }
}