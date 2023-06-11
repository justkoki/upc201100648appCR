package com.jtrujillo.dpmac.ui.solicitudes;

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
import android.widget.Button;

import com.jtrujillo.dpmac.SolicitudAdapter;
import com.jtrujillo.dpmac.Solicitud;
import com.jtrujillo.dpmac.R;
import com.jtrujillo.dpmac.databinding.FragmentSolicitudesPendientesBinding;

import java.util.ArrayList;
import java.util.List;

public class SolicitudesPendientesFragment extends Fragment {

    Button btnSolicitudRegistrar;
    List<Solicitud> solicitudList;
    private FragmentSolicitudesPendientesBinding binding;

    private SolicitudesPendientesViewModel mViewModel;

    public static SolicitudesPendientesFragment newInstance() {
        return new SolicitudesPendientesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
/*
        binding = FragmentSolicitudesPendientesBinding.inflate(inflater, container, false);
        return binding.getRoot();
*/
        View view = inflater.inflate(R.layout.fragment_solicitudes_pendientes, container, false);

        /*btnSolicitudRegistrar = (Button)view.findViewById(R.id.btnSolicitudRegistrar);
        btnSolicitudRegistrar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitud_registrar);
        });*/

        /*
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

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Solicitud> solicitudList = obtenerSolicitudes();
/*
        RecyclerView.Adapter<SolicitudAdapter.ViewHolder> adapter = new SolicitudAdapter(solicitudList, getContext());
        binding.rvwSolicitudes.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvwSolicitudes.setAdapter(adapter);
*/
        SolicitudAdapter solicitudAdapter = new SolicitudAdapter(solicitudList, getContext());
        RecyclerView rvwSolicitudes = view.findViewById(R.id.rvwSolicitudes);
        rvwSolicitudes.setHasFixedSize(true);
        rvwSolicitudes.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwSolicitudes.setAdapter(solicitudAdapter);

        btnSolicitudRegistrar = view.findViewById(R.id.btnSolicitudRegistrar);
        btnSolicitudRegistrar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitud_registrar);
        });

        /*btnSolicitudRegistrar = (Button)view.findViewById(R.id.btnSolicitudRegistrar);
        btnSolicitudRegistrar.setOnClickListener(v -> {
            Fragment frgSolicitudRegistrar = new SolicitudRegistrarFragment();
            FragmentManager frgManejador = frgSolicitudRegistrar.getActivity().getSupportFragmentManager();
            FragmentTransaction frgTransaccion = frgManejador.beginTransaction();
            frgTransaccion.replace(R.id.nav_host_fragment_content_menu_solicitante, frgSolicitudRegistrar);
            frgTransaccion.addToBackStack(null);
            frgTransaccion.commit();
        });*/
    }

    private List<Solicitud> obtenerSolicitudes() {
        List<Solicitud> solicitudes = new ArrayList<>();

        solicitudes.add(new Solicitud(
                1, 1, R.drawable.img_casa01, "Casa01",
                "PENDIENTE", "#969FAA", "25/08/2023",
                "S/. 50,000.00", "0.00%", "Por definir"
        ));
        solicitudes.add(new Solicitud(
                2, 1, R.drawable.img_departamento01, "Departamento01",
                "PENDIENTE", "#969FAA", "26/08/2023",
                "S/. 40,000.00", "0.00%", "Por definir"
        ));
        solicitudes.add(new Solicitud(
                3, 1, R.drawable.img_casa02, "Casa02",
                "PENDIENTE", "#969FAA", "27/08/2023",
                "S/. 70,000.00", "0.00%", "Por definir"
        ));
        solicitudes.add(new Solicitud(
                4, 1, R.drawable.img_departamento02, "Departamento02",
                "PENDIENTE", "#969FAA", "28/08/2023",
                "S/. 30,000.00", "0.00%", "Por definir"
        ));

        return solicitudes;
    }
/*
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
*/
}