package com.jtrujillo.dpmac.ui.oportunidades;

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

import com.jtrujillo.dpmac.R;
import com.jtrujillo.dpmac.entidades.Oportunidad;
import com.jtrujillo.dpmac.OportunidadAdapter;

import java.util.ArrayList;
import java.util.List;

public class OportunidadesFragment extends Fragment {

    Button btnVerMapaOportunidades;
    //CardView cvwOportunidad;
    //List<Oportunidad> oportunidadList;

    private OportunidadesViewModel mViewModel;

    public static OportunidadesFragment newInstance() {
        return new OportunidadesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_oportunidades, container, false);

        /*btnVerMapaOportunidades = (Button)view.findViewById(R.id.btnVerMapaOportunidades);
        btnVerMapaOportunidades.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidadesmapa);
        });*/

        /*cvwOportunidad = (CardView)view.findViewById(R.id.cvwOportunidad);
        cvwOportunidad.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidad_invertir);
        });*/

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OportunidadesViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Oportunidad> oportunidadList = obtenerOportunidades();

        OportunidadAdapter adapter = new OportunidadAdapter(oportunidadList, getContext());
        RecyclerView rvwOportunidades = view.findViewById(R.id.rvwOportunidades);
        rvwOportunidades.setHasFixedSize(true);
        rvwOportunidades.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwOportunidades.setAdapter(adapter);

        btnVerMapaOportunidades = (Button)view.findViewById(R.id.btnVerMapaOportunidades);
        btnVerMapaOportunidades.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidadesmapa);
        });
    }

    private List<Oportunidad> obtenerOportunidades() {
        List<Oportunidad> oportunidades = new ArrayList<>();

        oportunidades.add(new Oportunidad(
                1, "Casa", 5, "BAJO",
                "#13CE66", "#FFFFFF",
                "25/08/2023", "S/. 50,000.00", "20.00%", "1.67% / 20.00%",
                R.drawable.img_casa01, 30
        ));
        oportunidades.add(new Oportunidad(
                2, "Departamento", 5, "MODERADO",
                "#FFDC5C", "#FFFFFF",
                "26/08/2023", "S/. 40,000.00", "25.00%", "2.00% / 24.00%",
                R.drawable.img_departamento01, 15
        ));
        oportunidades.add(new Oportunidad(
                3, "Casa", 5, "MEDIO",
                "#FF9052", "#FFFFFF",
                "27/08/2023", "S/. 70,000.00", "20.00%", "1.75% / 21.00%",
                R.drawable.img_casa02, 40
        ));
        oportunidades.add(new Oportunidad(
                4, "Departamento", 5, "BAJO",
                "#13CE66", "#FFFFFF",
                "28/08/2023", "S/. 30,000.00", "30.00%", "1.83% / 22.00%",
                R.drawable.img_departamento02, 25
        ));

        return oportunidades;
    }

}