package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Endereco;
import com.estudo.cursoudemy.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listar() {
        List<Endereco> endereco = enderecoRepository.findAll();
        return endereco;
    }

    public Optional<Endereco> listarId (Integer id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        return endereco;
    }
}
