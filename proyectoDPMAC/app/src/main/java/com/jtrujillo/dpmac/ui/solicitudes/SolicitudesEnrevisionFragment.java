package com.jtrujillo.dpmac.ui.solicitudes;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jtrujillo.dpmac.R;
import com.jtrujillo.dpmac.Solicitud;
import com.jtrujillo.dpmac.SolicitudAdapter;

import java.util.ArrayList;
import java.util.List;

public class SolicitudesEnrevisionFragment extends Fragment {

    //CardView cvwSolicitud;
    List<Solicitud> solicitudList;

    private SolicitudesEnrevisionViewModel mViewModel;

    public static SolicitudesEnrevisionFragment newInstance() {
        return new SolicitudesEnrevisionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solicitudes_enrevision, container, false);

        /*cvwSolicitud = (CardView)view.findViewById(R.id.cvwSolicitud);
        cvwSolicitud.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitud_ver);
        });*/

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SolicitudesEnrevisionViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Solicitud> solicitudList = obtenerSolicitudes();

        SolicitudAdapter solicitudAdapter = new SolicitudAdapter(solicitudList, getContext());
        RecyclerView rvwSolicitudes = view.findViewById(R.id.rvwSolicitudes);
        rvwSolicitudes.setHasFixedSize(true);
        rvwSolicitudes.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwSolicitudes.setAdapter(solicitudAdapter);
    }

    private List<Solicitud> obtenerSolicitudes() {
        List<Solicitud> solicitudes = new ArrayList<>();

        solicitudes.add(new Solicitud(
                5, 2, R.drawable.img_casa03, "Casa03",
                "PENDIENTE", "#969FAA", "25/08/2023",
                "S/. 50,000.00", "25.00%", "S/. 200,000.00"
        ));
        solicitudes.add(new Solicitud(
                6, 2, R.drawable.img_departamento03, "Departamento03",
                "PENDIENTE", "#969FAA", "26/08/2023",
                "S/. 40,000.00", "0.00%", "Por definir"
        ));
        solicitudes.add(new Solicitud(
                7, 2, R.drawable.img_casa02, "Casa04",
                "PENDIENTE", "#969FAA", "27/08/2023",
                "S/. 70,000.00", "28.00%", "S/. 250,000.00"
        ));
        solicitudes.add(new Solicitud(
                8, 2, R.drawable.img_departamento02, "Departamento04",
                "PENDIENTE", "#969FAA", "26/08/2023",
                "S/. 60,000.00", "0.00%", "Por definir"
        ));

        return solicitudes;
    }

}