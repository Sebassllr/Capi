package com.api.capiro.controllers;

import com.api.capiro.entities.Item;
import com.api.capiro.repository.CustomRepository;
import com.api.capiro.repository.RecomendacionRepository;
import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("pedido/recomendacion")
public class RecomendacionController {

    @Autowired
    private CustomRepository customRepository;

    @Autowired
    private RecomendacionRepository recomendacionRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getRecomendacion(@PathVariable Long id) {
        return ResponseEntity.ok(customRepository.findRecomendationByClient(id));
    }

    @PostMapping
    public ResponseEntity<Object> saveRecomendation(@RequestBody Long id) {
        int random = (int) ((Math.random() * ((10 - 1) + 1)) + 1);
        Set<Item> items = new HashSet<>();
        for(int i = 0; i < random; i++) {
            Item item = new Item();
            item.setId((long) ((Math.random() * ((8 - 1) + 1)) + 1));
            items.add(item);
        }
        recomendacionRepository.findById(id);
        return null;
    }
}
