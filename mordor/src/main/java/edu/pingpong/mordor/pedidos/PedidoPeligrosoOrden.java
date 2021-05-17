package edu.pingpong.mordor.pedidos;

import java.util.UUID;

import edu.pingpong.mordor.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso{

    private final String id;
    private String destino;
    private int peso;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.instrucciones = instrucciones;
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

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }

}