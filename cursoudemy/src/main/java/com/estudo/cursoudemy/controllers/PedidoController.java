package com.estudo.cursoudemy.controllers;

import com.estudo.cursoudemy.domains.Pedido;
import com.estudo.cursoudemy.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listar() {
        List<Pedido> pedido = pedidoService.listar();
        return pedido;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Pedido>> listarId(@PathVariable Integer id) {
        Optional<Pedido> pedido = pedidoService.listarId(id);
        return ResponseEntity.ok().body(pedido);
    }
}
