package com.estudo.cursoudemy.controllers.exception;

import com.estudo.cursoudemy.domains.Estado;
import com.estudo.cursoudemy.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> listar() {
        List<Estado> estado = estadoService.listar();
        return estado;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Estado>> listarId(@PathVariable Integer id) {
        Optional<Estado> estado = estadoService.listarId(id);
        return ResponseEntity.ok().body(estado);
    }
}
