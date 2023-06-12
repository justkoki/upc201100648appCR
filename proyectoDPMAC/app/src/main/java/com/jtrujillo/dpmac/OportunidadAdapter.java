package com.jtrujillo.dpmac;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OportunidadAdapter extends RecyclerView.Adapter<OportunidadAdapter.ViewHolder> {

    private final List<Oportunidad> oportunidadList;
    private LayoutInflater myInflater;
    private Context myContext;

    public OportunidadAdapter(List<Oportunidad> itemList, Context context) {
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
        View view = myInflater.inflate(R.layout.item_oportunidad, parent, false);
        return new OportunidadAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Oportunidad item = oportunidadList.get(position);

        Integer idOportunidadEstado = item.getIdOportunidadEstado();

        holder.imgNomFoto.setImageResource(item.getResIdFoto());
        holder.txtNomOportunidadTipo.setText(item.getNomOportunidadTipo());
        holder.txtNomOportunidadPerfilRiesgo.setText(item.getNomOportunidadPerfilRiesgo());
        holder.txtNomOportunidadPerfilRiesgo.setBackgroundColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoFondoColor()));
        holder.txtNomOportunidadPerfilRiesgo.setTextColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoTextoColor()));
        holder.txtFecVigenciaFin.setText(item.getFecVigenciaFin());
        holder.txtImpPrestamo.setText(item.getImpPrestamo());
        holder.txtPctRatio.setText(item.getPctRatio());
        holder.txtImpTir.setText(item.getImpTir());
        holder.pgbPctInvertido.setProgress(item.getNumProgresoInversion());

        holder.itemView.setOnClickListener(v -> {
            Navigation.findNavController(holder.itemView).navigate(R.id.nav_oportunidad_invertir);
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgNomFoto;
        private final TextView txtNomOportunidadTipo, txtNomOportunidadPerfilRiesgo, txtFecVigenciaFin;
        private final TextView txtImpPrestamo, txtPctRatio, txtImpTir;
        private final ProgressBar pgbPctInvertido;

        ViewHolder(View itemView) {
            super(itemView);

            imgNomFoto                      = itemView.findViewById(R.id.imgNomFoto);
            txtNomOportunidadTipo           = itemView.findViewById(R.id.txtNomOportunidadTipo);
            txtNomOportunidadPerfilRiesgo   = itemView.findViewById(R.id.txtNomOportunidadPerfilRiesgo);
            txtFecVigenciaFin               = itemView.findViewById(R.id.txtFecVigenciaFin);
            txtImpPrestamo                  = itemView.findViewById(R.id.txtImpPrestamo);
            txtPctRatio                     = itemView.findViewById(R.id.txtPctRatio);
            txtImpTir                       = itemView.findViewById(R.id.txtImpTir);
            pgbPctInvertido                 = itemView.findViewById(R.id.pgbPctInvertido);
        }
    }

}
