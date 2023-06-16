package com.jtrujillo.dpmac.entidades;

import androidx.annotation.NonNull;

public class OportunidadTipo {
    private int idOportunidadTipo;
    private String nomOportunidadTipo;

    public OportunidadTipo(int idOportunidadTipo, String nomOportunidadTipo) {
        this.idOportunidadTipo = idOportunidadTipo;
        this.nomOportunidadTipo = nomOportunidadTipo;
    }

    public int getIdOportunidadTipo() {
        return idOportunidadTipo;
    }

    public void setIdOportunidadTipo(int idOportunidadTipo) {
        this.idOportunidadTipo = idOportunidadTipo;
    }

    public String getNomOportunidadTipo() {
        return nomOportunidadTipo;
    }

    public void setNomOportunidadTipo(String nomOportunidadTipo) {
        this.nomOportunidadTipo = nomOportunidadTipo;
    }

    @NonNull
    @Override
    public String toString() {
        return nomOportunidadTipo;
    }
}
