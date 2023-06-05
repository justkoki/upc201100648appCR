package com.jtrujillo.dpmac.ui.solicitudes;

import androidx.cardview.widget.CardView;
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

import com.jtrujillo.dpmac.R;

public class SolicitudesEnrevisionFragment extends Fragment {

    CardView cvwSolicitud;

    private SolicitudesEnrevisionViewModel mViewModel;

    public static SolicitudesEnrevisionFragment newInstance() {
        return new SolicitudesEnrevisionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solicitudes_enrevision, container, false);

        cvwSolicitud = (CardView)view.findViewById(R.id.cvwSolicitud);
        cvwSolicitud.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitud_ver);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SolicitudesEnrevisionViewModel.class);
        // TODO: Use the ViewModel
    }

}