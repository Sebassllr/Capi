package com.api.capiro.controllers;

import com.api.capiro.entities.Pedido;
import com.api.capiro.repository.PedidoRepository;
import com.sun.deploy.nativesandbox.comm.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.ServletRequest;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(pedidoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<Pedido> byId = pedidoRepository.findById(id);
        if(!byId.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(byId.get());
    }

    @PostMapping
    public ResponseEntity<Object> savePedido(@RequestBody Pedido pedido) {
        Pedido save = pedidoRepository.save(pedido);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public ResponseEntity<Object> updatePedido(@RequestBody Pedido pedido) {
        Pedido save = pedidoRepository.save(pedido);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping
    public ResponseEntity<Object> deletePedido(@RequestBody Long id) {
        pedidoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
