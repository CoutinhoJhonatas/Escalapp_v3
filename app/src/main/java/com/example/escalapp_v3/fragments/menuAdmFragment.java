package com.example.escalapp_v3.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.View;

import com.example.escalapp_v3.R;
import com.example.escalapp_v3.AtividadesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class menuAdmFragment extends Fragment implements View.OnClickListener {
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
        AdmCardCont.setOnClickListener(this);
        AdmCardPassword.setOnClickListener(this);
        AdmCardFunc.setOnClickListener(this);
        AdmCardAtividades.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            Intent i;
            case R.id.adm_cardAtividades: i = new Intent(this, AtividadesActivity.class);
            startActivity(i);
            break;
        }
    }
     */
}