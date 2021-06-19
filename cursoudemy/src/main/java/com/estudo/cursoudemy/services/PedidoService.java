package com.estudo.cursoudemy.services;

import com.estudo.cursoudemy.domains.Pedido;
import com.estudo.cursoudemy.repositories.PedidoRepository;
import com.estudo.cursoudemy.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listar() {
        List<Pedido> pedido = pedidoRepository.findAll();
        return  pedido;
    }

    public Optional<Pedido> listarId (Integer id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return Optional.ofNullable(pedido.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()
        )));
    }
}
