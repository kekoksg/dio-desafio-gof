package com.desafiodio.gof.service;

import com.desafiodio.gof.model.Cliente;

import java.util.Optional;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
