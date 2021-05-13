package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.escalapp_v3.R;

public class AlterarSenha extends AppCompatActivity implements View.OnClickListener{

    Button btnAltSenha;
    AppCompatEditText txtPassword, txtConPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);

        txtPassword = findViewById(R.id.txt_password);
        txtConPassword = findViewById(R.id.txt_confirm_password);

        btnAltSenha.setOnClickListener(this);
    }

    public void onClick(View v) {

    }
}