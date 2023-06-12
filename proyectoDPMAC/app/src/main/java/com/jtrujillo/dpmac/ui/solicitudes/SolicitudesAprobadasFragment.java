package com.jtrujillo.dpmac.ui.solicitudes;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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

public class SolicitudesAprobadasFragment extends Fragment {

    //CardView cvwSolicitud;
    List<Solicitud> solicitudList;

    private SolicitudesAprobadasViewModel mViewModel;

    public static SolicitudesAprobadasFragment newInstance() {
        return new SolicitudesAprobadasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solicitudes_aprobadas, container, false);

        /*cvwSolicitud = (CardView)view.findViewById(R.id.cvwSolicitud);
        cvwSolicitud.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitud_ver2);
        });*/

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SolicitudesAprobadasViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Solicitud> solicitudList = obtenerSolicitudes();

        SolicitudAdapter solicitudAdapter = new SolicitudAdapter(solicitudList, getContext());
        RecyclerView rvwSolicitudes = view.findViewById(R.id.rvwOportunidades);
        rvwSolicitudes.setHasFixedSize(true);
        rvwSolicitudes.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwSolicitudes.setAdapter(solicitudAdapter);
    }

    private List<Solicitud> obtenerSolicitudes() {
        List<Solicitud> solicitudes = new ArrayList<>();

        solicitudes.add(new Solicitud(
                9, 4, R.drawable.img_casa02, "Casa",
                "BAJO", "#13CE66", "#FFFFFF",
                "25/08/2023", "S/. 20,000.00", "20.00%", "S/. 100,000.00"
        ));
        solicitudes.add(new Solicitud(
                10, 4, R.drawable.img_departamento02, "Departamento",
                "MODERADO", "#FFDC5C", "#FFFFFF",
                "26/08/2023", "S/. 25,000.00", "16.67%", "S/. 150,000.00"
        ));
        solicitudes.add(new Solicitud(
                11, 4, R.drawable.img_casa03, "Casa",
                "MEDIO", "#FF9052", "#FFFFFF",
                "27/08/2023", "S/. 30,000.00", "15.00%", "S/. 200,000.00"
        ));
        solicitudes.add(new Solicitud(
                12, 4, R.drawable.img_departamento03, "Departamento",
                "BAJO", "#13CE66", "#FFFFFF",
                "28/08/2023", "S/. 40,000.00", "16.00%", "S/. 250,000.00"
        ));

        return solicitudes;
    }

}