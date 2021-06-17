package com.estudo.cursoudemy.resources;

import com.estudo.cursoudemy.domain.Categorias;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categorias> listar() {

        Categorias cat1 = new Categorias(1, "Informatica");
        Categorias cat2 = new Categorias(2, "Escritório");

        List<Categorias> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        return lista;
    }
}
