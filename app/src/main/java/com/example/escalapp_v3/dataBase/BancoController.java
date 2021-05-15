package com.example.escalapp_v3.dataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.escalapp_v3.model.Atividades;

import java.util.ArrayList;
import java.util.List;

public class BancoController implements IBancoController {


   private SQLiteDatabase escreve;
   private SQLiteDatabase le;


   public BancoController(Context context) {
      BancoOpenHelper db = new BancoOpenHelper(context);
      escreve = db.getWritableDatabase();
      le = db.getReadableDatabase();
   }

   @Override
   public boolean salvar(Atividades atividades) {

      ContentValues cv = new ContentValues();
      cv.put("atividades", atividades.getAtividade());

      try {

         escreve.insert(BancoOpenHelper.TABELA, null, cv );
         Log.i("INFO", "Tarefa Salva com sucesso");
      } catch (Exception e) {

         Log.e("INFO", "Erro ao salvar tarefa" + e.getMessage());
         return false;
      }

      return true;
   }

   @Override
   public boolean atualizar(Atividades atividades) {
      return false;
   }

   @Override
   public boolean deletar(Atividades atividades) {
      return false;
   }

   @Override
   public List<Atividades> listar() {

      List<Atividades> atividades = new ArrayList<>();

      String sql = "SELECT * FROM " + BancoOpenHelper.TABELA + " ; ";
      Cursor c = le.rawQuery(sql, null);

      while (c.moveToNext()) {

         Atividades atividade = new Atividades();

         Long id = c.getLong(c.getColumnIndex("id"));
         String nomeAtiv = c.getString(c.getColumnIndex("atividades"));

         atividade.setId(id);
         atividade.setAtividade(nomeAtiv);

         atividades.add(atividade);

      }

      return atividades;

   }

   /*
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
    */
}
