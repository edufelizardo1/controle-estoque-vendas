package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Categoria;
import com.estudo.cursoudemy.services.CategoriaService;
import com.estudo.cursoudemy.services.form.CategoriaForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<Object> salvarNovo(@RequestBody CategoriaForm categoriaForm) {
        Categoria categoria = categoriaService.salvarNovo(categoriaForm);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(categoria.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
