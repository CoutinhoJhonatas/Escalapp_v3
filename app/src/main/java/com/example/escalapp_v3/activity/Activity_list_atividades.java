package com.example.escalapp_v3.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.escalapp_v3.R;
import com.example.escalapp_v3.adapter.Adapter;
import com.example.escalapp_v3.model.Atividades;

import java.util.ArrayList;
import java.util.List;

public class Activity_list_atividades extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Atividades> listaAtiv = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_atividades);

        recyclerView = findViewById(R.id.recyclerList);

        //Listagem de filmes
        this.criarAtiv();

        //Configurar adapter
        Adapter adapter = new Adapter(listaAtiv);

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarAtiv(){

        Atividades atividades = new Atividades("Atividade1", "Responsável1");
        this.listaAtiv.add(atividades);

        atividades = new Atividades("Atividade2", "Responsável2");
        this.listaAtiv.add(atividades);

        atividades = new Atividades("Atividade3", "Responsável3");
        this.listaAtiv.add(atividades);

    }
}