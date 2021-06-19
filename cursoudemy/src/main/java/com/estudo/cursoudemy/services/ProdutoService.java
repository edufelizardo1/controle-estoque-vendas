package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Produto;
import com.estudo.cursoudemy.repositories.ProdutoRepository;
import com.estudo.cursoudemy.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        List<Produto> produto = produtoRepository.findAll();
        return produto;
    }

    public Optional<Produto> listarId (Integer id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return Optional.ofNullable(produto.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()
        )));
    }
}
