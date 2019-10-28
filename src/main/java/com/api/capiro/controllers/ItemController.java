package com.api.capiro.controllers;

import com.api.capiro.entities.Item;
import com.api.capiro.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public ResponseEntity<Object> getItem() {
        return ResponseEntity.ok(itemRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getItemById(@PathVariable Long id) {
        Optional<Item> byId = itemRepository.findById(id);
        if(!byId.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(byId.get());
    }
}
