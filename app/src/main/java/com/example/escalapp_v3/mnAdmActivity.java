package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mnAdmActivity extends AppCompatActivity {

    private CardView AdmCardCont, AdmCardPassword, AdmCardFunc, AdmCardAtividades;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        //Definindo os Cards
        super.onCreate(savedInstanceState);
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

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.adm_cardAtividades:
                i = new Intent(this, AtividadesActivity.class);
                startActivity(i);
                break;

            case R.id.adm_cardCont:
                i = new Intent(this, RecuperarSenha.class);
                startActivity(i);
                break;

            case R.id.adm_cardPassword:
                i = new Intent(this, RecuperarSenha.class);
                startActivity(i);
                break;

            case R.id.adm_cardFunc:
                i = new Intent(this, RecuperarSenha.class);
                startActivity(i);
                break;
        }
    }
}