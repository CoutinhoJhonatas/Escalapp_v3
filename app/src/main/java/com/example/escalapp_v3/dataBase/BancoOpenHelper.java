package com.example.escalapp_v3.dataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BancoOpenHelper extends SQLiteOpenHelper {
    public BancoOpenHelper(@Nullable Context context) {
        super(context, "BANCO", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL( ScriptDLL.getCreateTableADM() );
        db.execSQL( ScriptDLL.getCreateTableAtividades() );
        db.execSQL( ScriptDLL.getCreateTableFuncionario() );
        db.execSQL( ScriptDLL.getCreateTableGerente() );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
