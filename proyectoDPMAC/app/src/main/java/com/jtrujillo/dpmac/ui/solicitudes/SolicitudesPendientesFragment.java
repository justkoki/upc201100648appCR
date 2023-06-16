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
import com.jtrujillo.dpmac.entidades.Oportunidad;
import com.jtrujillo.dpmac.R;
import com.jtrujillo.dpmac.databinding.FragmentSolicitudesPendientesBinding;

import java.util.ArrayList;
import java.util.List;

public class SolicitudesPendientesFragment extends Fragment {

    Button btnSolicitudRegistrar;
    //List<Oportunidad> oportunidadList;
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

        List<Oportunidad> oportunidadList = obtenerOportunidades();
/*
        RecyclerView.Adapter<OportunidadAdapter.ViewHolder> adapter = new OportunidadAdapter(oportunidadList, getContext());
        binding.rvwSolicitudes.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvwSolicitudes.setAdapter(adapter);
*/
        SolicitudAdapter adapter = new SolicitudAdapter(oportunidadList, getContext());
        RecyclerView rvwSolicitudes = view.findViewById(R.id.rvwOportunidades);
        rvwSolicitudes.setHasFixedSize(true);
        rvwSolicitudes.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwSolicitudes.setAdapter(adapter);

        //adapter.setOnItemClickListener();

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

    private List<Oportunidad> obtenerOportunidades() {
        List<Oportunidad> oportunidades = new ArrayList<>();

        oportunidades.add(new Oportunidad(
                1, "Casa", 1,
                "PENDIENTE", "#969FAA",
                "#000000", "25/08/2023", "Por definir",
                "S/. 50,000.00", "0.00%", R.drawable.img_casa01
        ));
        oportunidades.add(new Oportunidad(
                2, "Departamento", 1,
                "PENDIENTE", "#969FAA",
                "#000000", "26/08/2023", "Por definir",
                "S/. 40,000.00", "0.00%", R.drawable.img_departamento01
        ));
        oportunidades.add(new Oportunidad(
                3, "Casa", 1,
                "PENDIENTE", "#969FAA",
                "#000000", "27/08/2023", "Por definir",
                "S/. 70,000.00", "0.00%", R.drawable.img_casa02
        ));
        oportunidades.add(new Oportunidad(
                4, "Departamento", 1,
                "PENDIENTE", "#969FAA",
                "#000000", "28/08/2023", "Por definir",
                "S/. 30,000.00", "0.00%", R.drawable.img_departamento02
        ));

        return oportunidades;
    }
/*
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
*/
}