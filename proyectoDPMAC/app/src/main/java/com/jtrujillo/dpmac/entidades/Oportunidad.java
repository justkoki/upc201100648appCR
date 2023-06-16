package com.jtrujillo.dpmac.entidades;

public class Oportunidad {
    private int idOportunidad;
    private int idOportunidadTipo;
    private String nomOportunidadTipo;
    private int idOportunidadEstado;
    private String nomOportunidadEstado;
    private int idOportunidadPerfilRiesgo;
    private String nomOportunidadPerfilRiesgo;
    private String codOportunidadPerfilRiesgoFondoColor;
    private String codOportunidadPerfilRiesgoTextoColor;
    private int idUsuario;
    private String nomOportunidad;
    private String desOportunidad;
    private String desDireccion;
    private float numLatitudMapa;
    private float numLongitudMapa;
    private String fecVigenciaInicio;
    private String fecVigenciaFin;
    private int numPartidaSunarp;
    private String impTasacion;
    private String impPrestamo;
    private String pctRatio;
    private float numTir;
    private String pctTir;
    private int numMesPlazo;
    private int indHipotecaPrevia;
    private String fecRegistro;
    private int resIdFoto;
    private int numProgresoInversion;

    public Oportunidad(int idOportunidad, String nomOportunidadTipo, int idOportunidadEstado, String nomOportunidadPerfilRiesgo, String codOportunidadPerfilRiesgoFondoColor, String codOportunidadPerfilRiesgoTextoColor, String fecVigenciaFin, String impTasacion, String impPrestamo, String pctRatio, int resIdFoto) {
        this.idOportunidad = idOportunidad;
        this.nomOportunidadTipo = nomOportunidadTipo;
        this.idOportunidadEstado = idOportunidadEstado;
        this.nomOportunidadPerfilRiesgo = nomOportunidadPerfilRiesgo;
        this.codOportunidadPerfilRiesgoFondoColor = codOportunidadPerfilRiesgoFondoColor;
        this.codOportunidadPerfilRiesgoTextoColor = codOportunidadPerfilRiesgoTextoColor;
        this.fecVigenciaFin = fecVigenciaFin;
        this.impTasacion = impTasacion;
        this.impPrestamo = impPrestamo;
        this.pctRatio = pctRatio;
        this.resIdFoto = resIdFoto;
    }

    public Oportunidad(int idOportunidad, String nomOportunidadTipo, int idOportunidadEstado, String nomOportunidadPerfilRiesgo, String codOportunidadPerfilRiesgoFondoColor, String codOportunidadPerfilRiesgoTextoColor, String fecVigenciaFin, String impPrestamo, String pctRatio, String pctTir, int resIdFoto, int numProgresoInversion) {
        this.idOportunidad = idOportunidad;
        this.nomOportunidadTipo = nomOportunidadTipo;
        this.idOportunidadEstado = idOportunidadEstado;
        this.nomOportunidadPerfilRiesgo = nomOportunidadPerfilRiesgo;
        this.codOportunidadPerfilRiesgoFondoColor = codOportunidadPerfilRiesgoFondoColor;
        this.codOportunidadPerfilRiesgoTextoColor = codOportunidadPerfilRiesgoTextoColor;
        this.fecVigenciaFin = fecVigenciaFin;
        this.impPrestamo = impPrestamo;
        this.pctRatio = pctRatio;
        this.pctTir = pctTir;
        this.resIdFoto = resIdFoto;
        this.numProgresoInversion = numProgresoInversion;
    }

    public int getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(int idOportunidad) {
        this.idOportunidad = idOportunidad;
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

    public int getIdOportunidadEstado() {
        return idOportunidadEstado;
    }

    public void setIdOportunidadEstado(int idOportunidadEstado) {
        this.idOportunidadEstado = idOportunidadEstado;
    }

    public String getNomOportunidadEstado() {
        return nomOportunidadEstado;
    }

    public void setNomOportunidadEstado(String nomOportunidadEstado) {
        this.nomOportunidadEstado = nomOportunidadEstado;
    }

    public int getIdOportunidadPerfilRiesgo() {
        return idOportunidadPerfilRiesgo;
    }

    public void setIdOportunidadPerfilRiesgo(int idOportunidadPerfilRiesgo) {
        this.idOportunidadPerfilRiesgo = idOportunidadPerfilRiesgo;
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

    public String getCodOportunidadPerfilRiesgoTextoColor() {
        return codOportunidadPerfilRiesgoTextoColor;
    }

    public void setCodOportunidadPerfilRiesgoTextoColor(String codOportunidadPerfilRiesgoTextoColor) {
        this.codOportunidadPerfilRiesgoTextoColor = codOportunidadPerfilRiesgoTextoColor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomOportunidad() {
        return nomOportunidad;
    }

    public void setNomOportunidad(String nomOportunidad) {
        this.nomOportunidad = nomOportunidad;
    }

    public String getDesOportunidad() {
        return desOportunidad;
    }

    public void setDesOportunidad(String desOportunidad) {
        this.desOportunidad = desOportunidad;
    }

    public String getDesDireccion() {
        return desDireccion;
    }

    public void setDesDireccion(String desDireccion) {
        this.desDireccion = desDireccion;
    }

    public float getNumLatitudMapa() {
        return numLatitudMapa;
    }

    public void setNumLatitudMapa(float numLatitudMapa) {
        this.numLatitudMapa = numLatitudMapa;
    }

    public float getNumLongitudMapa() {
        return numLongitudMapa;
    }

    public void setNumLongitudMapa(float numLongitudMapa) {
        this.numLongitudMapa = numLongitudMapa;
    }

    public String getFecVigenciaInicio() {
        return fecVigenciaInicio;
    }

    public void setFecVigenciaInicio(String fecVigenciaInicio) {
        this.fecVigenciaInicio = fecVigenciaInicio;
    }

    public String getFecVigenciaFin() {
        return fecVigenciaFin;
    }

    public void setFecVigenciaFin(String fecVigenciaFin) {
        this.fecVigenciaFin = fecVigenciaFin;
    }

    public int getNumPartidaSunarp() {
        return numPartidaSunarp;
    }

    public void setNumPartidaSunarp(int numPartidaSunarp) {
        this.numPartidaSunarp = numPartidaSunarp;
    }

    public String getImpTasacion() {
        return impTasacion;
    }

    public void setImpTasacion(String impTasacion) {
        this.impTasacion = impTasacion;
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

    public float getNumTir() {
        return numTir;
    }

    public void setNumTir(float numTir) {
        this.numTir = numTir;
    }

    public String getPctTir() {
        return pctTir;
    }

    public void setPctTir(String pctTir) {
        this.pctTir = pctTir;
    }

    public int getNumMesPlazo() {
        return numMesPlazo;
    }

    public void setNumMesPlazo(int numMesPlazo) {
        this.numMesPlazo = numMesPlazo;
    }

    public int getIndHipotecaPrevia() {
        return indHipotecaPrevia;
    }

    public void setIndHipotecaPrevia(int indHipotecaPrevia) {
        this.indHipotecaPrevia = indHipotecaPrevia;
    }

    public String getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(String fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public int getResIdFoto() {
        return resIdFoto;
    }

    public void setResIdFoto(int resIdFoto) {
        this.resIdFoto = resIdFoto;
    }

    public int getNumProgresoInversion() {
        return numProgresoInversion;
    }

    public void setNumProgresoInversion(int numProgresoInversion) {
        this.numProgresoInversion = numProgresoInversion;
    }
}
