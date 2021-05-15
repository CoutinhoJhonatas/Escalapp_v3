package com.example.escalapp_v3.dataBase;

import com.example.escalapp_v3.model.Atividades;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public interface IBancoController {

    public boolean salvar(Atividades atividades);
    public boolean atualizar(Atividades atividades);
    public boolean deletar(Atividades atividades);
    public List<Atividades> listar();

}
