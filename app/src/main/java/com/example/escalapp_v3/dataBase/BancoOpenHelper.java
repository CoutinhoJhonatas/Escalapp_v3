package com.example.escalapp_v3.dataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BancoOpenHelper extends SQLiteOpenHelper {
    public static final String ATIVIDADES = "atividades";
    public static final String RESPONSAVEL = "responsavel";
    private static final String NOME_BANCO = "banco.db";
    private static final String TABELA = "atividades";
    private static final String ID = "id_ativ";
    private static final int VERSAO = 5;

    public BancoOpenHelper(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

      //criando a tabela ativiadades
        String sql = "CREATE TABLE"+TABELA+"("
                +ID+ "integer primary key autoincrement,"
                +ATIVIDADES+ "text,"
                +RESPONSAVEL+"text"+")";

        db.execSQL(sql);
  }

  @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS" + TABELA);
    onCreate(db);
  }

}
