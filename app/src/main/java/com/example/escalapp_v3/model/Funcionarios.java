package com.example.escalapp_v3.model;

public class Funcionarios {

    private String funcionario;
    private String funcao;

    public Funcionarios() {

    }

    public Funcionarios(String funcionario, String funcao) {
        this.funcionario = funcionario;
        this.funcao = funcao;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
