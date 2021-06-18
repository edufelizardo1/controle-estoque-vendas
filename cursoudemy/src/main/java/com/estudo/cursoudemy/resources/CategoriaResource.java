package com.estudo.cursoudemy.resources;

import com.estudo.cursoudemy.domain.Categorias;
import com.estudo.cursoudemy.services.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriasService categoriasService;

    @GetMapping
    public List<Categorias> listar() {
        List<Categorias> categoria = categoriasService.buscar();
        return categoria;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Categorias>> buscarId(@PathVariable Integer id) {
        Optional<Categorias> categorias = categoriasService.buscarId(id);
        return ResponseEntity.ok().body(categorias);
    }
}
