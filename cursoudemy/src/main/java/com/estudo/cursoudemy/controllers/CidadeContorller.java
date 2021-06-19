package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Cidade;
import com.estudo.cursoudemy.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "cidades")
public class CidadeContorller {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<Cidade> listar() {
        List<Cidade> cidade = cidadeService.listar();
        return cidade;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Cidade>> listarId(@PathVariable Integer id) {
        Optional<Cidade> cidade = cidadeService.listarId(id);
        return ResponseEntity.ok().body(cidade);
    }
}
