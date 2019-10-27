package com.api.capiro.entities;

import com.api.capiro.enums.ContainerState;

import javax.persistence.*;
import java.util.List;

@Entity
public class Container {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ContainerState containerState;

    @OneToMany(mappedBy = "container")
    private List<Pedido> pedidoList;

    public Container(ContainerState containerState, List<Pedido> pedidoList) {
        this.containerState = containerState;
        this.pedidoList = pedidoList;
    }

    public Container() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContainerState getContainerState() {
        return containerState;
    }

    public void setContainerState(ContainerState containerState) {
        this.containerState = containerState;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }
}
