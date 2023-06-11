package com.jtrujillo.dpmac;

public class Solicitud {
    public Integer idOportunidad;
    public Integer idOportunidadEstado;
    public Integer resIdFoto;
    public String nomOportunidadTipo;
    public String nomOportunidadPerfilRiesgo;
    public String codOportunidadPerfilRiesgoFondoColor;
    public String fecVigenciaFin;
    public String impPrestamo;
    public String pctRatio;
    public String impTasacion;

    public Solicitud(
        Integer idOportunidad, Integer idOportunidadEstado, Integer resIdFoto, String nomOportunidadTipo,
        String nomOportunidadPerfilRiesgo, String codOportunidadPerfilRiesgoFondoColor, String fecVigenciaFin,
        String impPrestamo, String pctRatio, String impTasacion
    ) {
        this.idOportunidad = idOportunidad;
        this.idOportunidadEstado = idOportunidadEstado;
        this.resIdFoto = resIdFoto;
        this.nomOportunidadTipo = nomOportunidadTipo;
        this.nomOportunidadPerfilRiesgo = nomOportunidadPerfilRiesgo;
        this.codOportunidadPerfilRiesgoFondoColor = codOportunidadPerfilRiesgoFondoColor;
        this.fecVigenciaFin = fecVigenciaFin;
        this.impPrestamo = impPrestamo;
        this.pctRatio = pctRatio;
        this.impTasacion = impTasacion;
    }

    public Integer getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(Integer idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    public Integer getIdOportunidadEstado() {
        return idOportunidadEstado;
    }

    public void setIdOportunidadEstado(Integer idOportunidadEstado) {
        this.idOportunidadEstado = idOportunidadEstado;
    }

    public Integer getResIdFoto() {
        return resIdFoto;
    }

    public void setResIdFoto(Integer resIdFoto) {
        this.resIdFoto = resIdFoto;
    }

    public String getNomOportunidadTipo() {
        return nomOportunidadTipo;
    }

    public void setNomOportunidadTipo(String nomOportunidadTipo) {
        this.nomOportunidadTipo = nomOportunidadTipo;
    }

    public String getNomOportunidadPerfilRiesgo() {
        return nomOportunidadPerfilRiesgo;
    }

    public void setNomOportunidadPerfilRiesgo(String nomOportunidadPerfilRiesgo) {
        this.nomOportunidadPerfilRiesgo = nomOportunidadPerfilRiesgo;
    }

    public String getCodOportunidadPerfilRiesgoFondoColor() {
        return codOportunidadPerfilRiesgoFondoColor;
    }

    public void setCodOportunidadPerfilRiesgoFondoColor(String codOportunidadPerfilRiesgoFondoColor) {
        this.codOportunidadPerfilRiesgoFondoColor = codOportunidadPerfilRiesgoFondoColor;
    }

    public String getFecVigenciaFin() {
        return fecVigenciaFin;
    }

    public void setFecVigenciaFin(String fecVigenciaFin) {
        this.fecVigenciaFin = fecVigenciaFin;
    }

    public String getImpPrestamo() {
        return impPrestamo;
    }

    public void setImpPrestamo(String impPrestamo) {
        this.impPrestamo = impPrestamo;
    }

    public String getPctRatio() {
        return pctRatio;
    }

    public void setPctRatio(String pctRatio) {
        this.pctRatio = pctRatio;
    }

    public String getImpTasacion() {
        return impTasacion;
    }

    public void setImpTasacion(String impTasacion) {
        this.impTasacion = impTasacion;
    }
}
