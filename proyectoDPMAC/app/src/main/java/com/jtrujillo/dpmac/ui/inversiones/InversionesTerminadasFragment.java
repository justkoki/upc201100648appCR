package com.jtrujillo.dpmac.ui.inversiones;

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

import com.jtrujillo.dpmac.R;

public class InversionesTerminadasFragment extends Fragment {

    CardView cvwOportunidad;

    private InversionesTerminadasViewModel mViewModel;

    public static InversionesTerminadasFragment newInstance() {
        return new InversionesTerminadasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inversiones_terminadas, container, false);

        cvwOportunidad = (CardView)view.findViewById(R.id.cvwOportunidad4);
        cvwOportunidad.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_menu_inversionista);
            navController.navigate(R.id.nav_inversion_ver3);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InversionesTerminadasViewModel.class);
        // TODO: Use the ViewModel
    }

}