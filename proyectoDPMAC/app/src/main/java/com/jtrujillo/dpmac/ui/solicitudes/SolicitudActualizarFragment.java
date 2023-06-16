package com.jtrujillo.dpmac.ui.solicitudes;

import androidx.lifecycle.ViewModelProvider;

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

import com.jtrujillo.dpmac.R;

public class SolicitudActualizarFragment extends Fragment {

    Button btnSolicitudActualizar;

    private SolicitudActualizarViewModel mViewModel;

    public static SolicitudActualizarFragment newInstance() {
        return new SolicitudActualizarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solicitud_actualizar, container, false);
/*
        Solicitud solicitud = savedInstanceState.getParcelable("solicitud");
        ImageView imgNomFoto = view.findViewById(R.id.imgNomFoto);
        imgNomFoto.setImageResource(solicitud.getResIdFoto());
*/
        btnSolicitudActualizar = (Button)view.findViewById(R.id.btnSolicitudActualizar);
        btnSolicitudActualizar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitudes_pendientes);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SolicitudActualizarViewModel.class);
        // TODO: Use the ViewModel
    }

}