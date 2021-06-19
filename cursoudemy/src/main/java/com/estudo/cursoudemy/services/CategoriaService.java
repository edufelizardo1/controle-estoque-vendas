package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Categoria;
import com.estudo.cursoudemy.repositories.CategoriaRepository;
import com.estudo.cursoudemy.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listar() {
        List<Categoria> categoria = categoriaRepository.findAll();
        return categoria;
    }

    public Optional<Categoria> listarId(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return Optional.ofNullable(categoria.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()
        )));
    }
}
