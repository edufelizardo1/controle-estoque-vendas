package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Produto;
import com.estudo.cursoudemy.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        List<Produto> produto = produtoService.listar();
        return produto;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Produto>> ListarId (@PathVariable Integer id) {
        Optional<Produto> produto = produtoService.listarId(id);
        return ResponseEntity.ok().body(produto);
    }
}
