package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Endereco;
import com.estudo.cursoudemy.repositories.EnderecoRepository;
import com.estudo.cursoudemy.services.exception.ObjectNotFoundException;
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
        return Optional.ofNullable(endereco.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Endereco.class.getName()
        )));
    }
}
