package com.jtrujillo.dpmac.ui.inversiones;

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

public class InversionVer3Fragment extends Fragment {

    Button btnRegresar;

    private InversionVer3ViewModel mViewModel;

    public static InversionVer3Fragment newInstance() {
        return new InversionVer3Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inversion_ver3, container, false);

        btnRegresar = (Button)view.findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_inversiones_terminadas);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InversionVer3ViewModel.class);
        // TODO: Use the ViewModel
    }

}