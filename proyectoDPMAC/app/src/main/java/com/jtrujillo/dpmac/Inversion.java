package com.jtrujillo.dpmac;

public class Inversion {
    public Integer idOportunidad;
    public Integer idOportunidadEstado;
    public Integer resIdFoto;
    public String nomOportunidadTipo;
    public String nomOportunidadPerfilRiesgo;
    public String codOportunidadPerfilRiesgoFondoColor;
    public String codOportunidadPerfilRiesgoTextoColor;
    public String impGanancia;
    public String impPrestamo;
    public Integer numMesPlazo;
    public String impTir;
    public Integer numProgresoInversion;

    public Inversion(Integer idOportunidad, Integer idOportunidadEstado, Integer resIdFoto, String nomOportunidadTipo, String nomOportunidadPerfilRiesgo, String codOportunidadPerfilRiesgoFondoColor, String codOportunidadPerfilRiesgoTextoColor, String impGanancia, String impPrestamo, Integer numMesPlazo, String impTir, Integer numProgresoInversion) {
        this.idOportunidad = idOportunidad;
        this.idOportunidadEstado = idOportunidadEstado;
        this.resIdFoto = resIdFoto;
        this.nomOportunidadTipo = nomOportunidadTipo;
        this.nomOportunidadPerfilRiesgo = nomOportunidadPerfilRiesgo;
        this.codOportunidadPerfilRiesgoFondoColor = codOportunidadPerfilRiesgoFondoColor;
        this.codOportunidadPerfilRiesgoTextoColor = codOportunidadPerfilRiesgoTextoColor;
        this.impGanancia = impGanancia;
        this.impPrestamo = impPrestamo;
        this.numMesPlazo = numMesPlazo;
        this.impTir = impTir;
        this.numProgresoInversion = numProgresoInversion;
    }

    public Integer getIdOportunidad() {
        return idOportunidad;
    }

    public Integer getIdOportunidadEstado() {
        return idOportunidadEstado;
    }

    public Integer getResIdFoto() {
        return resIdFoto;
    }

    public String getNomOportunidadTipo() {
        return nomOportunidadTipo;
    }

    public String getNomOportunidadPerfilRiesgo() {
        return nomOportunidadPerfilRiesgo;
    }

    public String getCodOportunidadPerfilRiesgoFondoColor() {
        return codOportunidadPerfilRiesgoFondoColor;
    }

    public String getCodOportunidadPerfilRiesgoTextoColor() {
        return codOportunidadPerfilRiesgoTextoColor;
    }

    public String getImpGanancia() {
        return impGanancia;
    }

    public String getImpPrestamo() {
        return impPrestamo;
    }

    public Integer getNumMesPlazo() {
        return numMesPlazo;
    }

    public String getImpTir() {
        return impTir;
    }

    public Integer getNumProgresoInversion() {
        return numProgresoInversion;
    }
}
