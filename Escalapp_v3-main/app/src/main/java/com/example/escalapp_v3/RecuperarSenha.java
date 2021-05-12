package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecuperarSenha extends AppCompatActivity implements View.OnClickListener{

    Button btnSalvar;
    AppCompatEditText txtDgtCpf, txtDtNasc, txtDtAdmso, txtNewPassword, txtConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);

        btnSalvar = findViewById(R.id.btn_save);
        txtDgtCpf = findViewById(R.id.txt_dgt_cpf);
        txtDtNasc = findViewById(R.id.txt_dt_nasc);
        txtDtAdmso = findViewById(R.id.txt_dt_admso);
        txtNewPassword = findViewById(R.id.txt_new_password);
        txtConfirmPassword = findViewById(R.id.txt_confirm_password);

        btnSalvar.setOnClickListener(this);
    }

    public void onClick(View v) {

    }
}