package com.jtrujillo.dpmac.ui.usuarios;

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

public class UsuarioActualizarInversionistaFragment extends Fragment {

    Button btnUsuarioActualizar;

    private UsuarioActualizarInversionistaViewModel mViewModel;

    public static UsuarioActualizarInversionistaFragment newInstance() {
        return new UsuarioActualizarInversionistaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_usuario_actualizar_inversionista, container, false);

        btnUsuarioActualizar = (Button)view.findViewById(R.id.btnUsuarioActualizar);
        btnUsuarioActualizar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_oportunidades);
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(UsuarioActualizarInversionistaViewModel.class);
        // TODO: Use the ViewModel
    }

}