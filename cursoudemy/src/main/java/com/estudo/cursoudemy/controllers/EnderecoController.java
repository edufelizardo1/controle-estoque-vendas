package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Endereco;
import com.estudo.cursoudemy.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {
    @Autowired
    public EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> listar() {
        List<Endereco> endereco = enderecoService.listar();
        return endereco;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Endereco>> listarId (@PathVariable Integer id) {
        Optional<Endereco> endereco = enderecoService.listarId(id);
        return ResponseEntity.ok().body(endereco);
    }
}
