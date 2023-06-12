package com.jtrujillo.dpmac.ui.inversiones;

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

import com.jtrujillo.dpmac.Inversion;
import com.jtrujillo.dpmac.InversionAdapter;
import com.jtrujillo.dpmac.R;

import java.util.ArrayList;
import java.util.List;

public class InversionesTerminadasFragment extends Fragment {

    //CardView cvwOportunidad;
    List<Inversion> inversionList;

    private InversionesTerminadasViewModel mViewModel;

    public static InversionesTerminadasFragment newInstance() {
        return new InversionesTerminadasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inversiones_terminadas, container, false);

        /*cvwOportunidad = (CardView)view.findViewById(R.id.cvwOportunidad4);
        cvwOportunidad.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_inversion_ver3);
        });*/

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InversionesTerminadasViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Inversion> inversionList = obtenerInversiones();

        InversionAdapter inversionAdapter = new InversionAdapter(inversionList, getContext());
        RecyclerView rvwOportunidades = view.findViewById(R.id.rvwOportunidades);
        rvwOportunidades.setHasFixedSize(true);
        rvwOportunidades.setLayoutManager(new LinearLayoutManager(getContext()));
        rvwOportunidades.setAdapter(inversionAdapter);
    }

    private List<Inversion> obtenerInversiones() {
        List<Inversion> inversiones = new ArrayList<>();

        inversiones.add(new Inversion(
                52, 6, R.drawable.img_departamento02, "Departamento",
                "MODERADO", "#FFDC5C", "#FFFFFF",
                "S/. 4,800.00", "S/. 40,000.00", 24, "2.00% / 24.00%", 100
        ));
        inversiones.add(new Inversion(
                53, 6, R.drawable.img_casa03, "Casa",
                "MEDIO", "#FF9052", "#FFFFFF",
                "S/. 2,100.00", "S/. 70,000.00", 12, "1.75% / 21.00%", 100
        ));

        return inversiones;
    }

}