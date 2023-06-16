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

import com.jtrujillo.dpmac.entidades.Inversion;

import java.util.List;

public class InversionAdapter extends RecyclerView.Adapter<InversionAdapter.ViewHolder> {

    private final List<Inversion> inversionList;
    private LayoutInflater myInflater;
    private Context myContext;

    public InversionAdapter(List<Inversion> itemList, Context context) {
        this.myInflater = LayoutInflater.from(context);
        this.inversionList = itemList;
        this.myContext = context;
    }

    @Override
    public int getItemCount() {
        return inversionList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.item_inversion, parent, false);
        return new InversionAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Inversion item = inversionList.get(position);

        Integer idOportunidadEstado = item.getIdOportunidadEstado();

        holder.imgNomFoto.setImageResource(item.getResIdFoto());
        holder.txtNomOportunidadTipo.setText(item.getNomOportunidadTipo());
        holder.txtNomOportunidadPerfilRiesgo.setText(item.getNomOportunidadPerfilRiesgo());
        holder.txtNomOportunidadPerfilRiesgo.setBackgroundColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoFondoColor()));
        holder.txtNomOportunidadPerfilRiesgo.setTextColor(Color.parseColor(item.getCodOportunidadPerfilRiesgoTextoColor()));
        holder.txtImpGanancia.setText(item.getImpGanancia());
        holder.txtImpPrestamo.setText(item.getImpPrestamo());
        holder.txtNumMesPlazo.setText(item.getNumMesPlazo().toString());
        holder.txtPctTir.setText(item.getPctTir());
        holder.pgbPctInvertido.setProgress(item.getNumProgresoInversion());

        if (idOportunidadEstado == 6
            || idOportunidadEstado == 7
        ) {
            holder.pgbPctInvertido.setVisibility(View.GONE);
        }

        holder.itemView.setOnClickListener(v -> {
            if (idOportunidadEstado == 6) {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_inversion_ver2);
            } else if (idOportunidadEstado == 7) {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_inversion_ver3);
            } else {
                Navigation.findNavController(holder.itemView).navigate(R.id.nav_inversion_ver);
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgNomFoto;
        private final TextView txtNomOportunidadTipo, txtNomOportunidadPerfilRiesgo, txtImpGanancia;
        private final TextView txtImpPrestamo, txtNumMesPlazo, txtPctTir;
        private final ProgressBar pgbPctInvertido;

        ViewHolder(View itemView) {
            super(itemView);

            imgNomFoto                      = itemView.findViewById(R.id.imgNomFoto);
            txtNomOportunidadTipo           = itemView.findViewById(R.id.txtNomOportunidadTipo);
            txtNomOportunidadPerfilRiesgo   = itemView.findViewById(R.id.txtNomOportunidadPerfilRiesgo);
            txtImpGanancia                  = itemView.findViewById(R.id.txtImpGanancia);
            txtImpPrestamo                  = itemView.findViewById(R.id.txtImpPrestamo);
            txtNumMesPlazo                  = itemView.findViewById(R.id.txtNumMesPlazo);
            txtPctTir                       = itemView.findViewById(R.id.txtPctTir);
            pgbPctInvertido                 = itemView.findViewById(R.id.pgbPctInvertido);
        }
    }
}
