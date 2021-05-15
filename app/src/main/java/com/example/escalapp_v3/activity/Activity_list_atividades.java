package com.example.escalapp_v3.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.escalapp_v3.MainActivity;
import com.example.escalapp_v3.MainAdmActivity;
import com.example.escalapp_v3.R;
import com.example.escalapp_v3.adapter.Adapter;
import com.example.escalapp_v3.folgas;
import com.example.escalapp_v3.mnAdmActivity;
import com.example.escalapp_v3.mnFuncionario;
import com.example.escalapp_v3.model.Atividades;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Activity_list_atividades extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Atividades> listaAtiv = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_atividades);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setSelectedItemId(R.id.tarefasFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeFragment:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.folgasFragment:
                        startActivity(new Intent(getApplicationContext()
                                , folgas.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.tarefasFragment:
                        return true;
                    case R.id.maisFragment:
                        startActivity(new Intent(getApplicationContext()
                                , mnAdmActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

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