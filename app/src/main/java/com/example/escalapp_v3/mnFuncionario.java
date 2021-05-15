package com.example.escalapp_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.escalapp_v3.activity.Activity_list_atividades;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class mnFuncionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn_funcionario);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setSelectedItemId(R.id.maisFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeFragment:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.folgasFragment:
                        startActivity(new Intent(getApplicationContext()
                                ,folgas.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.tarefasFragment:
                        startActivity(new Intent(getApplicationContext()
                                , Activity_list_atividades.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.maisFragment:
                        return true;
                }
                return false;
            }
        });
    }
}