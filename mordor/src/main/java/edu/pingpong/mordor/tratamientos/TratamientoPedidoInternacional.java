package edu.pingpong.mordor.tratamientos;

import edu.pingpong.mordor.interfaces.TratamientoPedido;
import edu.pingpong.mordor.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {
    
    private PedidoInternacional pedidoInternacional;

    public TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional) {
        this.pedidoInternacional = pedidoInternacional;
    }

    public boolean tratar() {
        if (getPedido().destino() != "Mordor") {
            return true;
        }else {
            return false;
        }
    }

    public PedidoInternacional getPedido() {
        return this.pedidoInternacional;
    }

}