package com.api.capiro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ItemPedido implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private Long id;

    @Id
    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    @Id
    @ManyToOne
    @JoinColumn
    private Item item;

    private Long quantity;

    public ItemPedido(Pedido pedido, Item item, Long quantity) {
        this.pedido = pedido;
        this.item = item;
        this.quantity = quantity;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
