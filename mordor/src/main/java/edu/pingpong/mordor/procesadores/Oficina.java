package edu.pingpong.mordor.procesadores;

import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.Procesador;
import edu.pingpong.mordor.interfaces.TratamientoPedido;
import edu.pingpong.mordor.interfaces.Status;

public class Oficina implements Procesador {

    public Oficina() {
    }

    public boolean procesa(TratamientoPedido tratamientoPedido) {
        return tratamientoPedido.tratar();
    }

    public String printarStatus(boolean admitido, Pedido pedido) {
        return admitido? 
				pedido.destino() + " " + Status.ACEPTADO.name():
				pedido.destino() + " " + Status.RECHAZADO.name();
    }

}