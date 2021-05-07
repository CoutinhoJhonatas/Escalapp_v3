package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
    //Tela de Abertura com 3 segundos
public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //para alterar a tela seguinte troque o Login.class para a classe que quer abrir em seguida
                startActivity(new Intent(getBaseContext(), Login.class));
                finish();
            }
            //aqui você coloca o tempo de carregamento em milisegundo.
        }, 2000);
    }
}