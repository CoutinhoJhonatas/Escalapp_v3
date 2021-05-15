package com.example.escalapp_v3.dataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BancoOpenHelper extends SQLiteOpenHelper {
    public static final String ATIVIDADES = "atividades";
    public static final String RESPONSAVEL = "responsavel";
    private static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "atividades";
    private static final String ID = "id_ativ";
    private static final int VERSAO = 8;

    public BancoOpenHelper(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

      //criando a tabela ativiadades
        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA
                + " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " atividades TEXT NOT NULL); ";

        try {

            db.execSQL(sql);
            Log.i("INFO DB", "Sucesso ao criar a tabela");

        } catch (Exception e) {

            Log.i("INFO BD", "Erro ao criar a tabela" + e.getMessage());
        }

  }

  @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    //db.execSQL("DROP TABLE IF EXISTS" + TABELA);
    //onCreate(db);
  }

}
