package com.jtrujillo.dpmac.ui.misinversionesencobranza;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jtrujillo.dpmac.R;

public class MisinversionesEncobranzaFragment extends Fragment {

    private MisinversionesEncobranzaViewModel mViewModel;

    public static MisinversionesEncobranzaFragment newInstance() {
        return new MisinversionesEncobranzaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_misinversiones_encobranza, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MisinversionesEncobranzaViewModel.class);
        // TODO: Use the ViewModel
    }

}