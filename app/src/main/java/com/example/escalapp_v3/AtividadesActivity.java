package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.escalapp_v3.dataBase.BancoController;
import com.example.escalapp_v3.model.Atividades;

public class AtividadesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSalvar;
    private EditText editAtividade;
    private EditText editResponsavel;
    public static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";
    public static final String ARQUIVO_PREFERENCIA2 = "ArquivoPreferencia2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades);
  
  ImageButton voltarTl = (ImageButton) findViewById(R.id.btnBackAtv);

        voltarTl.setOnClickListener(this);
      
        //Button salvar = (Button)findViewById(R.id.btnSalvarAtv);
        buttonSalvar = findViewById(R.id.btnSalvarAtv);
        editAtividade = findViewById(R.id.createAtividade);
        editResponsavel = findViewById(R.id.createResponsavel);

        buttonSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {

                BancoController bancoController = new BancoController(getApplicationContext());

                Atividades atividade = new Atividades();
                Atividades responsavel = new Atividades();

                String nomeAtiv = editAtividade.getText().toString();
                String nomeRespon = editResponsavel.getText().toString();

                atividade.setAtividade(nomeAtiv);
                responsavel.setResponsavel(nomeRespon);
                bancoController.salvar(atividade);
                bancoController.salvar(responsavel);

                /*
                BancoController crud = new BancoController(getBaseContext());
                EditText atividades = (EditText) findViewById(R.id.createAtividade);
                EditText responsavel = (EditText) findViewById(R.id.createResponsavel);
                String atividadesString = atividades.getText().toString();
                String responsavelString = responsavel.getText().toString();
                String resultado;

                resultado = crud.insereDado(atividadesString, responsavelString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
                 */
            }
        });


        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBackAtv:
                Intent it = new Intent(this, mnAdmActivity.class);
                startActivity(it);
                break;
        }
    }
}
