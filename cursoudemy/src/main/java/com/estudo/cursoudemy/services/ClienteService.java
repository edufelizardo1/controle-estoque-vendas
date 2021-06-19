package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Cliente;
import com.estudo.cursoudemy.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar() {
        List<Cliente> cliente = clienteRepository.findAll();
        return  cliente;
    }

    public Optional<Cliente> listarId (Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente;
    }
}
