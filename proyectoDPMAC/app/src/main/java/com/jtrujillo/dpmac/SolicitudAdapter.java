package com.jtrujillo.dpmac;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SolicitudAdapter extends RecyclerView.Adapter<SolicitudAdapter.ViewHolder> {

    private final List<Solicitud> solicitudList;
    private LayoutInflater myInflater;
    private Context myContext;

    public SolicitudAdapter(List<Solicitud> itemList, Context context) {
        this.myInflater = LayoutInflater.from(context);
        this.solicitudList = itemList;
        this.myContext = context;
    }

    @Override
    public int getItemCount() {
        return solicitudList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.item_solicitud, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Solicitud item = solicitudList.get(position);

        Integer idOportunidadEstado = item.getIdOportunidadEstado();

        holder.imgNomFoto.setImageResource(item.getResIdFoto());
        holder.txtNomOportunidadTipo.setText(item.getNomOportunidadTipo());
        holder.txtNomOportunidadPerfilRiesgo.setText(item.getNomOportunidadPerfilRiesgo());
        holder.txtNomOportunidadPerfilRiesgo.setBackgroundColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoFondoColor()));
        holder.txtFecVigenciaFin.setText(item.getFecVigenciaFin());
        holder.txtImpPrestamo.setText(item.getImpPrestamo());
        holder.txtPctRatio.setText(item.getPctRatio().toString());
        holder.txtImpTasacion.setText(item.getImpTasacion());

        holder.itemView.setOnClickListener(v -> {
            if (idOportunidadEstado == 1) {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_solicitud_actualizar);
            } else if (idOportunidadEstado == 2) {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_solicitud_ver);
            } else {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_solicitud_ver2);
            }

        });
    }

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