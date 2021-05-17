package edu.pingpong.mordor.pedidos;

import java.util.UUID;

import edu.pingpong.mordor.interfaces.Pedido;

public class PedidoNacional implements Pedido{

    private final String id;
    private String destino;
    private int peso;

    public PedidoNacional(String destino, int peso) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.peso = peso;
    }

    public String getId() {
        return this.id;
    }

    public String destino() {
        return this.destino;
    }

    public int peso() {
        return this.peso;
    }

}