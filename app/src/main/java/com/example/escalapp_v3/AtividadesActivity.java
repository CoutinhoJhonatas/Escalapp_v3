package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.escalapp_v3.dataBase.BancoController;

public class AtividadesActivity extends AppCompatActivity {

    private Button buttonSalvar;
    private EditText editAtividade;
    private EditText editResponsavel;
    public static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";
    public static final String ARQUIVO_PREFERENCIA2 = "ArquivoPreferencia2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades);

        //Button salvar = (Button)findViewById(R.id.btnSalvarAtv);
        buttonSalvar = findViewById(R.id.btnSalvarAtv);
        editAtividade = findViewById(R.id.createAtividade);
        editResponsavel = findViewById(R.id.createResponsavel);

        buttonSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences preferences2 = getSharedPreferences(ARQUIVO_PREFERENCIA2, 0);
                SharedPreferences.Editor editor = preferences.edit();
                SharedPreferences.Editor editor2 = preferences2.edit();

                //Validar o nome

                if (editAtividade.getText().toString().equals("") && editResponsavel.getText().toString().equals("")) {

                    Toast.makeText(getApplicationContext(), "Preencha o campo vazio", Toast.LENGTH_LONG).show();
                }
                else {

                    String atividade = editAtividade.getText().toString();
                    String responsavel = editResponsavel.getText().toString();
                    editor.putString("atividade", atividade);
                    editor2.putString("responsavel", responsavel);
                    editor.commit();
                    editor2.commit();
                }

                /*
                BancoController crud = new BancoController(getBaseContext());
                EditText atividades = (EditText)findViewById(R.id.createAtividade);
                EditText responsavel = (EditText)findViewById(R.id.createResponsavel);
                String atividadesString = atividades.getText().toString();
                String responsavelString = responsavel.getText().toString();
                String resultado;

                resultado = crud.insereDado(atividadesString, responsavelString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
                 */
            }
        });

        //Recuperar dados salvos

        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        SharedPreferences preferences2 = getSharedPreferences(ARQUIVO_PREFERENCIA2, 0);

        if (preferences.contains("atividade") && preferences2.contains("responsavel")) {

            String atividade = preferences.getString("atividade", "");
            String reponsavel = preferences.getString("responsavel", "");

        }
    }
}