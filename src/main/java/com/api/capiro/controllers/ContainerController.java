package com.api.capiro.controllers;

import com.api.capiro.entities.Container;
import com.api.capiro.repository.ContainerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("container")
public class ContainerController {

    private ContainerRepository containerRepository;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(containerRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<Container> byId = containerRepository.findById(id);
        if(!byId.isPresent()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(byId.get());
    }
}
