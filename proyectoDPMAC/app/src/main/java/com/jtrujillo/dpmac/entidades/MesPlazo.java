package com.jtrujillo.dpmac.entidades;

import androidx.annotation.NonNull;

public class MesPlazo {
    private int numMesPlazo;
    private String nomMesPlazo;

    public MesPlazo(int numMesPlazo, String nomMesPlazo) {
        this.numMesPlazo = numMesPlazo;
        this.nomMesPlazo = nomMesPlazo;
    }

    public int getNumMesPlazo() {
        return numMesPlazo;
    }

    public void setNumMesPlazo(int numMesPlazo) {
        this.numMesPlazo = numMesPlazo;
    }

    public String getNomMesPlazo() {
        return nomMesPlazo;
    }

    public void setNomMesPlazo(String nomMesPlazo) {
        this.nomMesPlazo = nomMesPlazo;
    }

    @NonNull
    @Override
    public String toString() {
        return nomMesPlazo;
    }
}
