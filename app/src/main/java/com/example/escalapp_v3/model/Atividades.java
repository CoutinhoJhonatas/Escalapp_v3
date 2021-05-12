package com.example.escalapp_v3.model;

public class Atividades {

    private String atividade;
    private String responsavel;

    public Atividades() {

    }

    public Atividades(String atividade, String responsavel) {
        this.atividade = atividade;
        this.responsavel = responsavel;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
