package com.jtrujillo.dpmac.ui.oportunidades;

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

public class OportunidadesmapaFragment extends Fragment {

    Button btnVerListaOportunidades;

    private OportunidadesmapaViewModel mViewModel;

    public static OportunidadesmapaFragment newInstance() {
        return new OportunidadesmapaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_oportunidadesmapa, container, false);

        btnVerListaOportunidades = (Button)view.findViewById(R.id.btnVerListaOportunidades);
        btnVerListaOportunidades.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidades);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OportunidadesmapaViewModel.class);
        // TODO: Use the ViewModel
    }

}