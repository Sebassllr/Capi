package com.api.capiro.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private Long id;

    private String name;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemPedido> itemPedido;

    public Item(String name, List<ItemPedido> itemPedido) {
        this.name = name;
        this.itemPedido = itemPedido;
    }

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(List<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }
}
