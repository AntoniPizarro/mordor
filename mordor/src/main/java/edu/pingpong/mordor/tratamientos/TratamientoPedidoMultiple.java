package edu.pingpong.mordor.tratamientos;

import java.util.Set;

import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido {
    
    private Set<Pedido> pedidos;
    private Integer pesoTotal = 0;
	private Long numBultos = 0L;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean tratar() {
        return true;
    }


    public Integer getPesoTotal() {
        return this.pesoTotal;
    }

    public void calcularPesoTotal() {
        int res = 0;
        for (Pedido pedido : pedidos) {
            res += pedido.peso();
        }
        this.pesoTotal = res;
    }

    public Long getNumBultos() {
        return this.numBultos;
    }

    public void calcularNumBultos() {
        Long res = 0L;
        for (Pedido pedido : pedidos) {
            res++;
        }
        this.numBultos = res;
    }


}