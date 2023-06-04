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

public class OportunidadInvertirFragment extends Fragment {

    Button btnOportunidadInvertir;

    private OportunidadInvertirViewModel mViewModel;

    public static OportunidadInvertirFragment newInstance() {
        return new OportunidadInvertirFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_oportunidad_invertir, container, false);

        btnOportunidadInvertir = (Button)view.findViewById(R.id.btnOportunidadInvertir);
        btnOportunidadInvertir.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidades);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OportunidadInvertirViewModel.class);
        // TODO: Use the ViewModel
    }

}