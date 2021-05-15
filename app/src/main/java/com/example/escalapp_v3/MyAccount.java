package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyAccount extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        ImageButton voltarTl = (ImageButton) findViewById(R.id.btnBackInfo);

        voltarTl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBackInfo:
                Intent it = new Intent(this, mnAdmActivity.class);
                startActivity(it);
                break;
        }
    }
}