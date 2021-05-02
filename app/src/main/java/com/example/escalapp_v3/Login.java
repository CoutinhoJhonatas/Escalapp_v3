package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    //Login: 123
    //Senha: 123

    Button btnEntrar;
    AppCompatEditText txtCpf, txtSenha;
    TextView txtEsqueceuSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnEntrar = findViewById(R.id.btn_entrar);
        txtCpf = findViewById(R.id.txt_credentials);
        txtSenha = findViewById(R.id.txt_password);
        txtEsqueceuSenha = findViewById(R.id.txt_forgot_password);

        btnEntrar.setOnClickListener(this);
        txtEsqueceuSenha.setOnClickListener(this);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.txt_forgot_password) {

            Intent telaRecuperarSenha = new Intent(this, RecuperarSenha.class);
            startActivity(telaRecuperarSenha);
        }
        if (v.getId() == R.id.btn_entrar) {

            String nCpf = txtCpf.getText().toString();
            String nSenha = txtSenha.getText().toString();

            int cpf = Integer.parseInt(nCpf);
            int senha = Integer.parseInt(nSenha);

            if (cpf == 123 && senha == 123) {

                Intent telaMain = new Intent(this, MainActivity.class);
                startActivity(telaMain);
            }

        }
    }
}