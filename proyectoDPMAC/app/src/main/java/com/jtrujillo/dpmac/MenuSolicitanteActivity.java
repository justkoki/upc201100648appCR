package com.jtrujillo.dpmac;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.jtrujillo.dpmac.databinding.ActivityMenuSolicitanteBinding;

public class MenuSolicitanteActivity extends AppCompatActivity
        /*implements NavigationView.OnNavigationItemSelectedListener*/ {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMenuSolicitanteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuSolicitanteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMenuSolicitante.toolbar);
        /*
        binding.appBarMenuSolicitante.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                /*R.id.nav_solicitud_registrar, */
                R.id.nav_solicitudes_pendientes, R.id.nav_solicitudes_enrevision, R.id.nav_solicitudes_aprobadas,
                R.id.nav_usuario_actualizar_solicitante)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_menu_solicitante);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_solicitante, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_menu_solicitante);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    /*
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int idNavItem = item.getItemId();
        Toast.makeText(getApplicationContext(), idNavItem, Toast.LENGTH_LONG).show();
        if (idNavItem == R.id.nav_logout) {
            Toast.makeText(getApplicationContext(), "nav_logout", Toast.LENGTH_LONG).show();
            //Intent i = new Intent(this, InicioActivity.class);
            //startActivity(i);
        }
        //if (idNavItem == R.id.nav_usuario_actualizar) {}
        return true;
    }
    */
}