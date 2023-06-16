package com.jtrujillo.dpmac.ui.inversiones;

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

import com.jtrujillo.dpmac.entidades.Inversion;
import com.jtrujillo.dpmac.InversionAdapter;
import com.jtrujillo.dpmac.R;

import java.util.ArrayList;
import java.util.List;

public class InversionesFragment extends Fragment {

    //CardView cvwOportunidad;
    //List<Inversion> inversionList;

    private InversionesViewModel mViewModel;

    public static InversionesFragment newInstance() {
        return new InversionesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inversiones, container, false);

        /*cvwOportunidad = (CardView) view.findViewById(R.id.cvwOportunidad);
        cvwOportunidad.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_inversion_ver);
        });*/

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InversionesViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Inversion> inversionList = obtenerInversiones();

        InversionAdapter adapter = new InversionAdapter(inversionList, getContext());
        RecyclerView rvwOportunidades = view.findViewById(R.id.rvwOportunidades);
        rvwOportunidades.setHasFixedSize(true);
        rvwOportunidades.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwOportunidades.setAdapter(adapter);

    }

    private List<Inversion> obtenerInversiones() {
        List<Inversion> inversiones = new ArrayList<>();

        inversiones.add(new Inversion(
                101, "Casa", 5, "BAJO",
                "#13CE66", "#FFFFFF",
                "S/. 50,000.00", "S/. 2,000.00", "1.67% / 20.00%",
                12, R.drawable.img_casa01, 30
        ));
        inversiones.add(new Inversion(
                102, "Departamento", 5, "MODERADO",
                "#FFDC5C", "#FFFFFF",
                "S/. 40,000.00", "S/. 4,800.00", "2.00% / 24.00%",
                24, R.drawable.img_departamento01, 15
        ));
        inversiones.add(new Inversion(
                103, "Casa", 5, "MEDIO",
                "#FF9052", "#FFFFFF",
                "S/. 70,000.00", "S/. 2,100.00", "1.75% / 21.00%",
                12, R.drawable.img_casa02, 40
        ));
        inversiones.add(new Inversion(
                104, "Departamento", 5, "BAJO",
                "#13CE66", "#FFFFFF",
                "S/. 30,000.00", "S/. 4,400.00", "1.83% / 22.00%",
                24, R.drawable.img_departamento02, 25
        ));

        return inversiones;
    }

}