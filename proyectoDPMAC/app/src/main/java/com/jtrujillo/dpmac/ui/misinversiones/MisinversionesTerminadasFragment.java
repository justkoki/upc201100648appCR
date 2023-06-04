package com.jtrujillo.dpmac.ui.misinversiones;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jtrujillo.dpmac.R;

public class MisinversionesTerminadasFragment extends Fragment {

    private MisinversionesTerminadasViewModel mViewModel;

    public static MisinversionesTerminadasFragment newInstance() {
        return new MisinversionesTerminadasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_misinversiones_terminadas, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MisinversionesTerminadasViewModel.class);
        // TODO: Use the ViewModel
    }

}