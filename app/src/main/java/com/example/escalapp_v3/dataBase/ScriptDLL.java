package com.example.escalapp_v3.dataBase;

public class ScriptDLL {

    public static String getCreateTableADM() {
        //strutura do banco Administrador
        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE ADM ( ");
        sql.append("cpf INTEGER PRIMARY KEY AUTOINCREMENT,");
        sql.append("nome STRING,");
        sql.append("funcao STRING,");
        sql.append("data_nasc DATE,");
        sql.append("data_adimissao DATE,");
        sql.append("telefone INTEGER);");

        return sql.toString();
    }
        //Estrutura do banco de Atividades
    public static String getCreateTableAtividades() {

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE Atividades (");
        sql.append("IDATIVIDADES INTEGER PRIMARY KEY,");
        sql.append("ID_FUNC INTEGER REFERENCES Funcionario (ID),");
        sql.append("atividades STRING,");
        sql.append("responsavel STRING);");

        return sql.toString();
    }
        //Estrutura do Banco de Funcionários
    public static String getCreateTableFuncionario() {

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE Funcionario (");
        sql.append("ID INTEGER PRIMARY KEY AUTOINCREMENT,");
        sql.append("cpf INTEGER,");
        sql.append("nome STRING,");
        sql.append("funcao STRING,");
        sql.append("telefone INTEGER,");
        sql.append("data_nasc DATE,");
        sql.append("data_adimissao DATE);");

        return sql.toString();
    }
        //Estrutura do banco do gerente
    public static String getCreateTableGerente() {

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE Gerente (");
        sql.append("cpf INTEGER PRIMARY KEY AUTOINCREMENT,");
        sql.append("nome STRING,");
        sql.append("telefone INTEGER,");
        sql.append("data_nasc DATE,");
        sql.append("data_adimissao DATE);");

        return sql.toString();
    }
}
