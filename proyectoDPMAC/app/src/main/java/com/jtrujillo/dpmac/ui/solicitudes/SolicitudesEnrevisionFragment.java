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
import com.jtrujillo.dpmac.entidades.Oportunidad;
import com.jtrujillo.dpmac.SolicitudAdapter;

import java.util.ArrayList;
import java.util.List;

public class SolicitudesEnrevisionFragment extends Fragment {

    //CardView cvwSolicitud;
    //List<Oportunidad> oportunidadList;

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

        List<Oportunidad> oportunidadList = obtenerOportunidades();

        SolicitudAdapter adapter = new SolicitudAdapter(oportunidadList, getContext());
        RecyclerView rvwSolicitudes = view.findViewById(R.id.rvwOportunidades);
        rvwSolicitudes.setHasFixedSize(true);
        rvwSolicitudes.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwSolicitudes.setAdapter(adapter);
    }

    private List<Oportunidad> obtenerOportunidades() {
        List<Oportunidad> oportunidades = new ArrayList<>();

        oportunidades.add(new Oportunidad(
                5, "Casa", 2,
                "PENDIENTE", "#969FAA",
                "#000000", "25/08/2023",
                "S/. 200,000.00", "S/. 50,000.00", "25.00%",
                R.drawable.img_casa03
        ));
        oportunidades.add(new Oportunidad(
                6, "Departamento", 2,
                "PENDIENTE", "#969FAA",
                "#000000", "26/08/2023",
                "Por definir", "S/. 40,000.00", "0.00%",
                R.drawable.img_departamento03
        ));
        oportunidades.add(new Oportunidad(
                7, "Casa", 2,
                "PENDIENTE", "#969FAA",
                "#000000", "27/08/2023",
                "S/. 250,000.00", "S/. 70,000.00", "28.00%",
                R.drawable.img_casa02
        ));
        oportunidades.add(new Oportunidad(
                8, "Departamento", 2,
                "PENDIENTE", "#969FAA",
                "#000000", "26/08/2023",
                "Por definir", "S/. 60,000.00", "0.00%",
                R.drawable.img_departamento02
        ));

        return oportunidades;
    }

}