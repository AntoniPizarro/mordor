package edu.pingpong.mordor.tratamientos;

import edu.pingpong.mordor.interfaces.PedidoPeligroso;
import edu.pingpong.mordor.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
    
    private PedidoPeligroso pedidoPeligroso;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligroso) {
        this.pedidoPeligroso = pedidoPeligroso;
    }

    public boolean tratar(){
        if (pedidoPeligroso.instrucciones() != "No ponerselo en el dedo") {
            return true;
        }else {
            return false;
        }
    }

    public PedidoPeligroso getPedido() {
        return this.pedidoPeligroso;
    }

}