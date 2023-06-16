package com.jtrujillo.dpmac.entidades;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Solicitud implements Parcelable {
    private Integer idOportunidad;
    private Integer idOportunidadEstado;
    private Integer resIdFoto;
    private String nomOportunidadTipo;
    private String nomOportunidadPerfilRiesgo;
    private String codOportunidadPerfilRiesgoFondoColor;
    private String codOportunidadPerfilRiesgoTextoColor;
    private String fecVigenciaFin;
    private String impPrestamo;
    private String pctRatio;
    private String impTasacion;

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

    protected Solicitud(Parcel in) {
        if (in.readByte() == 0) {
            idOportunidad = null;
        } else {
            idOportunidad = in.readInt();
        }
        if (in.readByte() == 0) {
            idOportunidadEstado = null;
        } else {
            idOportunidadEstado = in.readInt();
        }
        if (in.readByte() == 0) {
            resIdFoto = null;
        } else {
            resIdFoto = in.readInt();
        }
        nomOportunidadTipo = in.readString();
        nomOportunidadPerfilRiesgo = in.readString();
        codOportunidadPerfilRiesgoFondoColor = in.readString();
        codOportunidadPerfilRiesgoTextoColor = in.readString();
        fecVigenciaFin = in.readString();
        impPrestamo = in.readString();
        pctRatio = in.readString();
        impTasacion = in.readString();
    }

    public static final Creator<Solicitud> CREATOR = new Creator<Solicitud>() {
        @Override
        public Solicitud createFromParcel(Parcel in) {
            return new Solicitud(in);
        }

        @Override
        public Solicitud[] newArray(int size) {
            return new Solicitud[size];
        }
    };

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

    public String getCodOportunidadPerfilRiesgoTextoColor() {
        return codOportunidadPerfilRiesgoTextoColor;
    }

    public void setCodOportunidadPerfilRiesgoTextoColor(String codOportunidadPerfilRiesgoTextoColor) {
        this.codOportunidadPerfilRiesgoTextoColor = codOportunidadPerfilRiesgoTextoColor;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        if (idOportunidad == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(idOportunidad);
        }
        if (idOportunidadEstado == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(idOportunidadEstado);
        }
        if (resIdFoto == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(resIdFoto);
        }
        dest.writeString(nomOportunidadTipo);
        dest.writeString(nomOportunidadPerfilRiesgo);
        dest.writeString(codOportunidadPerfilRiesgoFondoColor);
        dest.writeString(codOportunidadPerfilRiesgoTextoColor);
        dest.writeString(fecVigenciaFin);
        dest.writeString(impPrestamo);
        dest.writeString(pctRatio);
        dest.writeString(impTasacion);
    }
}
