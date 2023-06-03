package com.jtrujillo.dpmac.ui.oportunidadesmapa;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jtrujillo.dpmac.R;

public class OportunidadesmapaFragment extends Fragment {

    private OportunidadesmapaViewModel mViewModel;

    public static OportunidadesmapaFragment newInstance() {
        return new OportunidadesmapaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_oportunidadesmapa, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OportunidadesmapaViewModel.class);
        // TODO: Use the ViewModel
    }

}