package edu.pingpong.mordor.procesadores;

import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.Procesador;
import edu.pingpong.mordor.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public Oficina() {
    }

    public boolean procesa(TratamientoPedido tratamientoPedido) {
        return tratamientoPedido.tratar();
    }

    public String printarStatus(boolean admitido, Pedido pedido) {
        return ""; //Falta implementar lógica
    }

}