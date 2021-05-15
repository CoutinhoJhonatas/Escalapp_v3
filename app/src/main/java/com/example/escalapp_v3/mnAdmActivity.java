package com.example.escalapp_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.escalapp_v3.activity.Activity_list_atividades;
import com.example.escalapp_v3.model.Atividades;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class mnAdmActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card4, card5, card6, card7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn_adm);

        card4 = (CardView) findViewById(R.id.adm_cardCont);
        card5 = (CardView) findViewById(R.id.adm_cardPassword);
        card6 = (CardView) findViewById(R.id.adm_cardFunc);
        card7 = (CardView) findViewById(R.id.adm_cardAtividades);

        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);

        //Barra de Navegação
        //Ela quem puxa e deixa clicado

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setSelectedItemId(R.id.maisFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.homeFragment:
                        startActivity(new Intent(getApplicationContext()
                                , MainAdmActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.folgasFragment:
                        startActivity(new Intent(getApplicationContext()
                                , folgas.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.tarefasFragment:
                        startActivity(new Intent(getApplicationContext()
                                , Activity_list_atividades.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.maisFragment:
                        startActivity(new Intent(getApplicationContext()
                                , mnAdmActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.adm_cardCont:
                i = new Intent(this, MyAccount.class);
                startActivity(i);
                break;

            case R.id.adm_cardPassword:
                i = new Intent(this, AlterarSenha.class);
                startActivity(i);
                break;

            case R.id.adm_cardFunc:
                i = new Intent(this, ListFunc.class);
                startActivity(i);
                break;

            case R.id.adm_cardAtividades:
                i = new Intent(this, AtividadesActivity.class);
                startActivity(i);
                break;
        }
    }
}