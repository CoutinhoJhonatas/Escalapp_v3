package com.example.escalapp_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.escalapp_v3.activity.Activity_list_atividades;
import com.example.escalapp_v3.model.Atividades;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3;

     @Override
      protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

         card1 = (CardView) findViewById(R.id.cardFolgas);
         card2 = (CardView) findViewById(R.id.cardAtividades);
         card3 = (CardView) findViewById(R.id.cardMenu);

         card1.setOnClickListener(this);
         card2.setOnClickListener(this);
         card3.setOnClickListener(this);

      BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

      bottomNavigationView.setSelectedItemId(R.id.homeFragment);

      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
              switch (item.getItemId()){
                  case R.id.homeFragment:
                      return true;
                  case R.id.folgasFragment:
                      startActivity(new Intent(getApplicationContext()
                              ,folgas.class));
                      overridePendingTransition(0,0);
                      return true;
                  case R.id.tarefasFragment:
                      startActivity(new Intent(getApplicationContext()
                              ,Activity_list_atividades.class));
                      overridePendingTransition(0,0);
                      return true;
                  case R.id.maisFragment:
                      startActivity(new Intent(getApplicationContext()
                              ,mnAdmActivity.class));
                      overridePendingTransition(0,0);
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
            case R.id.cardFolgas:
                i = new Intent(this, folgas.class);
                startActivity(i);
                break;

            case R.id.cardAtividades:
                i = new Intent(this, Activity_list_atividades.class);
                startActivity(i);
                break;

            case R.id.cardMenu:
                i = new Intent(this, mnAdmActivity.class);
                startActivity(i);
                break;
        }

    }
}