package com.example.escalapp_v3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.escalapp_v3.R;
import com.example.escalapp_v3.model.Funcionarios;

import java.util.List;

public class AdapterFunc extends RecyclerView.Adapter<AdapterFunc.MyViewHolder> {

    private List<Funcionarios> listaFunc;

    public AdapterFunc(List<Funcionarios> lista) {

        this.listaFunc = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View funcLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_func, parent, false);

        return new MyViewHolder(funcLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Funcionarios funcionarios = listaFunc.get(position);
        holder.funcionario.setText(funcionarios.getFuncionario());
        holder.funcao.setText(funcionarios.getFuncao());
    }

    @Override
    public int getItemCount() {
        return listaFunc.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView funcionario;
        TextView funcao;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            funcionario = itemView.findViewById(R.id.textFunc);
            funcao = itemView.findViewById(R.id.textFuncao);

        }
    }

}
