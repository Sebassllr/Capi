package com.api.capiro.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recomendacion {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Item> items;

    @OneToOne
    private Cliente cliente;

    public Recomendacion(List<Item> items, Cliente cliente) {
        this.items = items;
        this.cliente = cliente;
    }

    public Recomendacion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
