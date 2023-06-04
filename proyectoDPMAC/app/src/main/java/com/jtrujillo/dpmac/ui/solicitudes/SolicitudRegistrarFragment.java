package com.jtrujillo.dpmac.ui.solicitudes;

import androidx.lifecycle.ViewModelProvider;

import android.app.DatePickerDialog;
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
import android.widget.EditText;

import com.jtrujillo.dpmac.R;

public class SolicitudRegistrarFragment extends Fragment {

    Button btnSolicitudRegistrar;

    EditText txtFecVigenciaInicio;
    DatePickerDialog dpdFecVigenciaInicio;

    private SolicitudRegistrarViewModel mViewModel;

    public static SolicitudRegistrarFragment newInstance() {
        return new SolicitudRegistrarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solicitud_registrar, container, false);

        btnSolicitudRegistrar = (Button)view.findViewById(R.id.btnSolicitudRegistrar);
        btnSolicitudRegistrar.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_solicitante);
            navController.navigate(R.id.nav_solicitudes_pendientes);
        });

        /*
        txtFecVigenciaInicio = (EditText)view.findViewById(R.id.txtFecVigenciaInicio);
        Calendar calendario = Calendar.getInstance();
        int numDia = calendario.get(Calendar.DAY_OF_MONTH);
        int numMes = calendario.get(Calendar.MONTH);
        int numAnio = calendario.get(Calendar.YEAR);

        txtFecVigenciaInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dpdFecVigenciaInicio = new DatePickerDialog(MenuSolicitanteActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txtFecVigenciaInicio.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                    }
                }, numAnio, numMes, numDia);
            }
        });

        dpdFecVigenciaInicio.show();
        */
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SolicitudRegistrarViewModel.class);
        // TODO: Use the ViewModel
    }

}