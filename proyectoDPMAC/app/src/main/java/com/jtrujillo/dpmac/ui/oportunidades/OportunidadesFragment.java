package com.jtrujillo.dpmac.ui.oportunidades;

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
import android.widget.Button;

import com.jtrujillo.dpmac.R;

public class OportunidadesFragment extends Fragment {

    Button btnVerMapaOportunidades;
    CardView cvwOportunidad;

    private OportunidadesViewModel mViewModel;

    public static OportunidadesFragment newInstance() {
        return new OportunidadesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_oportunidades, container, false);

        btnVerMapaOportunidades = (Button)view.findViewById(R.id.btnVerMapaOportunidades);
        btnVerMapaOportunidades.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidadesmapa);
        });

        cvwOportunidad = (CardView)view.findViewById(R.id.cvwOportunidad);
        cvwOportunidad.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidad_invertir);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OportunidadesViewModel.class);
        // TODO: Use the ViewModel
    }

}