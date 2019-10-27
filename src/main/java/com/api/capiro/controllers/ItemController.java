package com.api.capiro.controllers;

import com.api.capiro.entities.Item;
import com.api.capiro.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public Iterable<Item> getItem() {
        Iterable<Item> all = itemRepository.findAll();
        return all;
    }

}
