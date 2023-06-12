package com.jtrujillo.dpmac;

public class Solicitud {
    public Integer idOportunidad;
    public Integer idOportunidadEstado;
    public Integer resIdFoto;
    public String nomOportunidadTipo;
    public String nomOportunidadPerfilRiesgo;
    public String codOportunidadPerfilRiesgoFondoColor;
    public String codOportunidadPerfilRiesgoTextoColor;
    public String fecVigenciaFin;
    public String impPrestamo;
    public String pctRatio;
    public String impTasacion;

    public Solicitud(Integer idOportunidad, Integer idOportunidadEstado, Integer resIdFoto, String nomOportunidadTipo, String nomOportunidadPerfilRiesgo, String codOportunidadPerfilRiesgoFondoColor, String codOportunidadPerfilRiesgoTextoColor, String fecVigenciaFin, String impPrestamo, String pctRatio, String impTasacion) {
        this.idOportunidad = idOportunidad;
        this.idOportunidadEstado = idOportunidadEstado;
        this.resIdFoto = resIdFoto;
        this.nomOportunidadTipo = nomOportunidadTipo;
        this.nomOportunidadPerfilRiesgo = nomOportunidadPerfilRiesgo;
        this.codOportunidadPerfilRiesgoFondoColor = codOportunidadPerfilRiesgoFondoColor;
        this.codOportunidadPerfilRiesgoTextoColor = codOportunidadPerfilRiesgoTextoColor;
        this.fecVigenciaFin = fecVigenciaFin;
        this.impPrestamo = impPrestamo;
        this.pctRatio = pctRatio;
        this.impTasacion = impTasacion;
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

    public String getFecVigenciaFin() {
        return fecVigenciaFin;
    }

    public String getImpPrestamo() {
        return impPrestamo;
    }

    public String getPctRatio() {
        return pctRatio;
    }

    public String getImpTasacion() {
        return impTasacion;
    }
}
