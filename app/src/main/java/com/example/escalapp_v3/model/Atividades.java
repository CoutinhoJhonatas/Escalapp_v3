package com.example.escalapp_v3.model;

import java.io.Serializable;

public class Atividades implements Serializable {

    private String atividade;
    private String responsavel;
    private Long id;


    public Atividades() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
