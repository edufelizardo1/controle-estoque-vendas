package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Cliente;
import com.estudo.cursoudemy.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar() {
        List<Cliente> cliente = clienteService.listar();
        return cliente;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Cliente>> listarId (@PathVariable Integer id) {
        Optional<Cliente> cliente = clienteService.listarId(id);
        return ResponseEntity.ok().body(cliente);
    }
}
