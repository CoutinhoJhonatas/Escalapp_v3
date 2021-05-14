package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.escalapp_v3.adapter.AdapterFunc;
import com.example.escalapp_v3.model.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class ListFunc extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Funcionarios> listaFunc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_func);

        recyclerView = findViewById(R.id.recyclerFunc);

        //Listagem de filmes
        this.criarFunc();

        //Configurar adapter
        AdapterFunc adapterFunc = new AdapterFunc(listaFunc);

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterFunc);

    }

    public void criarFunc() {

        Funcionarios funcionario = new Funcionarios("Funcionário 1", "Função 1");
        this.listaFunc.add(funcionario);

        funcionario = new Funcionarios("Funcionário 2", "Função 2");
        this.listaFunc.add(funcionario);

        funcionario = new Funcionarios("Funcionário 3", "Função 3");
        this.listaFunc.add(funcionario);
    }
}