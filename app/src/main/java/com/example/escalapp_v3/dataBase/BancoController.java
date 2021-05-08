package com.example.escalapp_v3.dataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {

   private SQLiteDatabase db;
   private BancoOpenHelper banco;

   public BancoController(Context context){
       banco = new BancoOpenHelper(context);
   }

   public String insereDado(String atividades, String responsavel){
       ContentValues valores;
       long resultado;

       db = banco.getWritableDatabase();
       valores = new ContentValues();
       valores.put(BancoOpenHelper.ATIVIDADES, atividades);
       valores.put(BancoOpenHelper.RESPONSAVEL, responsavel);

       resultado = db.insert(BancoOpenHelper.ATIVIDADES, null, valores);
       db.close();

       if (resultado ==-1)
           return "Erro ao adicionar Atividade";
       else
           return "Atividade adicionada";
   }
}
