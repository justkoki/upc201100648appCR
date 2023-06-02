package com.jtrujillo.dpmac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UsuarioLoginSolicitanteActivity extends AppCompatActivity {

    Button btnLogin;
    TextView txtRegistrarseLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_login_solicitante);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            //Bundle bndDatos = new Bundle();
            //bndDatos.putInt("idUsuarioTipo", 2);

            Intent i = new Intent(this, WelcomeSolicitanteActivity.class);
            //i.putExtras(bndDatos);
            startActivity(i);
        });

        txtRegistrarseLink = (TextView)findViewById(R.id.txtRegistrarseLink);
        txtRegistrarseLink.setOnClickListener(v -> {
            Intent i = new Intent(this, RegistroPerfilActivity.class);
            startActivity(i);
        });
    }
}