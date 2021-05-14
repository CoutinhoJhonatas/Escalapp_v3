package com.example.escalapp_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.escalapp_v3.fragments.atividadesFragment;
import com.example.escalapp_v3.fragments.folgasFragment;
import com.example.escalapp_v3.fragments.homeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainAdmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ocultar a Action Bar

        //iniciando o menu para trocar entre as telas
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new homeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {

                        case R.id.homeFragment:
                            selectedFragment = new homeFragment();
                            break;

                        case R.id.folgasFragment:
                            selectedFragment = new folgasFragment();
                            break;

                        case R.id.atividadesFragment:
                            selectedFragment = new atividadesFragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}