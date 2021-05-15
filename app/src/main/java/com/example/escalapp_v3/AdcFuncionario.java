package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdcFuncionario extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adc_funcionario);

        ImageButton voltarTl = (ImageButton) findViewById(R.id.btnBackAtv);

        voltarTl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBackAtv:
                Intent it = new Intent(this, ListFunc.class);
                startActivity(it);
                break;
        }
    }
}