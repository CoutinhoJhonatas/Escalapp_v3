package com.example.escalapp_v3.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.escalapp_v3.AtividadesActivity;
import com.example.escalapp_v3.MainActivity;
import com.example.escalapp_v3.MainAdmActivity;
import com.example.escalapp_v3.R;
import com.example.escalapp_v3.adapter.Adapter;
import com.example.escalapp_v3.dataBase.BancoController;
import com.example.escalapp_v3.dataBase.BancoOpenHelper;
import com.example.escalapp_v3.folgas;
import com.example.escalapp_v3.mnAdmActivity;
import com.example.escalapp_v3.mnFuncionario;
import com.example.escalapp_v3.model.Atividades;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

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
        
        //Listagem de atividades
        this.criarAtiv();

        //Configurar adapter
        Adapter adapter = new Adapter(listaAtiv);

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AtividadesActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        criarAtiv();
        super.onStart();
    }

    public void criarAtiv(){

        BancoController bancoController = new BancoController(getApplicationContext());
        listaAtiv = bancoController.listar();


    }
}