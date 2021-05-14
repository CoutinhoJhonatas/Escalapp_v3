package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.escalapp_v3.activity.Activity_list_atividades;
import com.example.escalapp_v3.model.Atividades;

public class mnAdmActivity extends AppCompatActivity {

    CardView AdmCardCont, AdmCardPassword, AdmCardFunc, AdmCardAtividades;
    Button btnHome, btnFolga, btnTarefas, btnMenu;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn_adm);

        //homeFragment, folgasFragment... foram criados para navegação usando Fragment mas deu errado, porem recliclei os id criados para declarar aqui
        btnHome = (Button) findViewById(R.id.homeFragment);
        btnFolga = (Button) findViewById(R.id.folgasFragment);
        btnTarefas = (Button) findViewById(R.id.tarefasFragment);
        btnMenu = (Button) findViewById(R.id.maisFragment);

        //Definindo os Cards
        AdmCardCont = (CardView) AdmCardCont.findViewById(R.id.adm_cardCont);
        AdmCardPassword = (CardView) AdmCardPassword.findViewById(R.id.adm_cardPassword);
        AdmCardFunc = (CardView) AdmCardFunc.findViewById(R.id.adm_cardFunc);
        AdmCardAtividades = (CardView) AdmCardAtividades.findViewById(R.id.adm_cardAtividades);

        //Adicionando os Click Listenner aos cards
        AdmCardCont.setOnClickListener((View.OnClickListener) this);
        AdmCardPassword.setOnClickListener((View.OnClickListener) this);
        AdmCardFunc.setOnClickListener((View.OnClickListener) this);
        AdmCardAtividades.setOnClickListener((View.OnClickListener) this);
    }


    //Aqui eu coloco o comando que seria (activity onde estamos).this e depois a activity que queremos abrir
    public void BtnFolga(View v){
        Intent in = new Intent(mnAdmActivity.this, folgas.class);
        startActivity(in);
    }

    public void BtnTarefas(View v){
        Intent in = new Intent(mnAdmActivity.this, Atividades.class);
        startActivity(in);
    }

    public void BtnHome(View v){
        Intent in = new Intent(mnAdmActivity.this, MainActivity.class);
        startActivity(in);
    }

    //Aqui eu colo os comandos para os CardViews
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.adm_cardAtividades:
                i = new Intent(mnAdmActivity.this, Activity_list_atividades.class);
                startActivity(i);
                break;

            case R.id.adm_cardCont:
                i = new Intent(mnAdmActivity.this, MyAccount.class);
                startActivity(i);
                break;

            case R.id.adm_cardPassword:
                i = new Intent(mnAdmActivity.this, RecuperarSenha.class);
                startActivity(i);
                break;

            case R.id.adm_cardFunc:
                i = new Intent(mnAdmActivity.this, mnFuncionario.class);
                startActivity(i);
                break;
        }
    }
}