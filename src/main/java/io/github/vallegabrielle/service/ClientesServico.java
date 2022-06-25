package io.github.vallegabrielle.service;

import io.github.vallegabrielle.model.Client;
import io.github.vallegabrielle.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServico {

    private ClientesRepository repository;

    @Autowired
    public ClientesServico(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Client cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Client cliente) {
        //aplicar validacoes
    }

}
