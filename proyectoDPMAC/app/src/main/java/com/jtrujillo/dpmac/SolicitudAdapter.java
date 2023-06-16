package com.jtrujillo.dpmac;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.jtrujillo.dpmac.entidades.Oportunidad;

import java.util.List;

public class SolicitudAdapter
        extends RecyclerView.Adapter<SolicitudAdapter.ViewHolder>
        /*implements View.OnClickListener*/ {

    private final List<Oportunidad> oportunidadList;
    private LayoutInflater myInflater;
    private Context myContext;

    //private View.OnClickListener listener;

    public SolicitudAdapter(List<Oportunidad> itemList, Context context) {
        this.myInflater = LayoutInflater.from(context);
        this.oportunidadList = itemList;
        this.myContext = context;
    }

    @Override
    public int getItemCount() {
        return oportunidadList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.item_solicitud, parent, false);

        //view.setOnClickListener(this);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Oportunidad item = oportunidadList.get(position);

        int idOportunidadEstado = item.getIdOportunidadEstado();

        holder.imgNomFoto.setImageResource(item.getResIdFoto());
        holder.txtNomOportunidadTipo.setText(item.getNomOportunidadTipo());
        holder.txtNomOportunidadPerfilRiesgo.setText(item.getNomOportunidadPerfilRiesgo());
        holder.txtNomOportunidadPerfilRiesgo.setBackgroundColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoFondoColor()));
        holder.txtNomOportunidadPerfilRiesgo.setTextColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoTextoColor()));
        holder.txtFecVigenciaFin.setText(item.getFecVigenciaFin());
        holder.txtImpPrestamo.setText(item.getImpPrestamo());
        holder.txtPctRatio.setText(item.getPctRatio());
        holder.txtImpTasacion.setText(item.getImpTasacion());

        holder.itemView.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            //bundle.putParcelable("solicitud", solicitudList.get(holder.getBindingAdapterPosition()));

            if (idOportunidadEstado == 1) {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_solicitud_actualizar, bundle);
            } else if (idOportunidadEstado == 2) {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_solicitud_ver, bundle);
            } else {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_solicitud_ver2, bundle);
            }
        });
    }
/*
    @Override
    public void onClick(View v) {

    }
*/
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgNomFoto;
        private final TextView txtNomOportunidadTipo, txtNomOportunidadPerfilRiesgo, txtFecVigenciaFin;
        private final TextView txtImpPrestamo, txtPctRatio, txtImpTasacion;

        ViewHolder(View itemView) {
            super(itemView);

            imgNomFoto                      = itemView.findViewById(R.id.imgNomFoto);
            txtNomOportunidadTipo           = itemView.findViewById(R.id.txtNomOportunidadTipo);
            txtNomOportunidadPerfilRiesgo   = itemView.findViewById(R.id.txtNomOportunidadPerfilRiesgo);
            txtFecVigenciaFin               = itemView.findViewById(R.id.txtFecVigenciaFin);
            txtImpPrestamo                  = itemView.findViewById(R.id.txtImpPrestamo);
            txtPctRatio                     = itemView.findViewById(R.id.txtPctRatio);
            txtImpTasacion                  = itemView.findViewById(R.id.txtImpTasacion);
        }
    }

}