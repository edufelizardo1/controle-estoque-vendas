package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Cidade;
import com.estudo.cursoudemy.repositories.CidadeRepository;
import com.estudo.cursoudemy.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> listar() {
        List<Cidade> cidade = cidadeRepository.findAll();
        return  cidade;
    }

    public Optional<Cidade> listarId(Integer id) {
        Optional<Cidade> cidade = cidadeRepository.findById(id);
        return Optional.ofNullable(cidade.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()
        )));
    }
}
