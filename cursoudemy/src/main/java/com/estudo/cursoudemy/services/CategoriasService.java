package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domain.Categorias;
import com.estudo.cursoudemy.repositories.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;

    public List<Categorias> buscar () {
        List<Categorias> categorias = categoriasRepository.findAll();
        return categorias;
    }

    public Optional<Categorias> buscarId(Integer id) {
        Optional<Categorias> categorias = categoriasRepository.findById(id);
        return  categorias;
    }
}
