package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.escalapp_v3.dataBase.BancoController;

public class AtividadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades);

        Button salvar = (Button)findViewById(R.id.btnSalvarAtv);

        salvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText atividades = (EditText)findViewById(R.id.createAtividade);
                EditText responsavel = (EditText)findViewById(R.id.createResponsavel);
                String atividadesString = atividades.getText().toString();
                String responsavelString = responsavel.getText().toString();
                String resultado;

                resultado = crud.insereDado(atividadesString, responsavelString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}