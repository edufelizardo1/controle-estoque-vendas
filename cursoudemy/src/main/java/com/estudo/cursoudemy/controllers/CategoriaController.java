package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Categoria;
import com.estudo.cursoudemy.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        List<Categoria> categoria = categoriaService.listar();
        return categoria;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Categoria>> listarId(@PathVariable Integer id) {
        Optional<Categoria> categoria = categoriaService.listarId(id);
        return ResponseEntity.ok().body(categoria);
    }
}
