package com.example.escalapp_v3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.escalapp_v3.R;
import com.example.escalapp_v3.model.Atividades;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Atividades> listaAtividade;

    public Adapter(List<Atividades> lista) {

        this.listaAtividade = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {

        Atividades atividade = listaAtividade.get(position);
        holder.responsavel.setText(atividade.getResponsavel());
        holder.atividade.setText(atividade.getAtividade());
    }

    @Override
    public int getItemCount() {
        return listaAtividade.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView atividade;
        TextView responsavel;
        TextView ano;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            atividade = itemView.findViewById(R.id.textAtividades);
            responsavel = itemView.findViewById(R.id.textRespons);

        }
    }

}
