package com.jtrujillo.dpmac.ui.solicitudespendientes;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.jtrujillo.dpmac.R;
import com.jtrujillo.dpmac.RegistroPerfilActivity;
import com.jtrujillo.dpmac.databinding.FragmentHomeBinding;
import com.jtrujillo.dpmac.databinding.FragmentSolicitudesPendientesBinding;
import com.jtrujillo.dpmac.ui.solicitudregistrar.SolicitudRegistrarFragment;

public class SolicitudesPendientesFragment extends Fragment {

    Button btnSolicitudRegistrar;

    private SolicitudesPendientesViewModel mViewModel;

    public static SolicitudesPendientesFragment newInstance() {
        return new SolicitudesPendientesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solicitudes_pendientes, container, false);

        /*
        btnSolicitudRegistrar = (Button)view.findViewById(R.id.btnSolicitudRegistrar);
        btnSolicitudRegistrar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitud_registrar);
        });
        btnSolicitudRegistrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Fragment frgSolicitudRegistrar = new SolicitudRegistrarFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(
                    R.id.nav_host_fragment_content_menu_solicitante, frgSolicitudRegistrar
                ).commit();
            }
        });
        btnSolicitudRegistrar.setOnClickListener(v -> {
            Fragment frgSolicitudRegistrar = new SolicitudRegistrarFragment();
            FragmentManager frgManejador = getActivity().getSupportFragmentManager();
            FragmentTransaction frgTransaccion = frgManejador.beginTransaction();
            frgTransaccion.replace(R.id.nav_host_fragment_content_menu_solicitante, frgSolicitudRegistrar);
            frgTransaccion.addToBackStack(null);
            frgTransaccion.commit();
        });
        */
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SolicitudesPendientesViewModel.class);
        // TODO: Use the ViewModel
    }
/*
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnSolicitudRegistrar = (Button)view.findViewById(R.id.btnSolicitudRegistrar);
        btnSolicitudRegistrar.setOnClickListener(v -> {
            Fragment frgSolicitudRegistrar = new SolicitudRegistrarFragment();
            FragmentManager frgManejador = frgSolicitudRegistrar.getActivity().getSupportFragmentManager();
            FragmentTransaction frgTransaccion = frgManejador.beginTransaction();
            frgTransaccion.replace(R.id.nav_host_fragment_content_menu_solicitante, frgSolicitudRegistrar);
            frgTransaccion.addToBackStack(null);
            frgTransaccion.commit();
        });
    }
*/
}