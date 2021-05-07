package com.example.escalapp_v3.dataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BancoOpenHelper extends SQLiteOpenHelper {
    // aqui cria as informações no banco, trocar a versão quando for alterar alguma coisa.
    public BancoOpenHelper(@Nullable Context context) {
        super(context, "BANCO", null, 1);
    }


    //Aqui ele chama o script da Classe ScriptDLL para criar a tabela
    //Para adicionar outra tabela, coloque a estrutura no DLL e declare aqui para chamar

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL( ScriptDLL.getCreateTableADM() );
        db.execSQL( ScriptDLL.getCreateTableAtividades() );
        db.execSQL( ScriptDLL.getCreateTableFuncionario() );
        db.execSQL( ScriptDLL.getCreateTableGerente() );
    }

    //Aqui você configura todos os input do banco
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
