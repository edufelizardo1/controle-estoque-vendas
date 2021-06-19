package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Estado;
import com.estudo.cursoudemy.repositories.EstadoRepository;
import com.estudo.cursoudemy.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> listar(){
        List<Estado> estado = estadoRepository.findAll();
        return estado;
    }

    public Optional<Estado> listarId (Integer id) {
        Optional<Estado> estado = estadoRepository.findById(id);
        return Optional.ofNullable(estado.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()
        )));
    }
}
