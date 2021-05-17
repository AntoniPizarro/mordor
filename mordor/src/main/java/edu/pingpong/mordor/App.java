package edu.pingpong.mordor;

import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.PedidoPeligroso;
import edu.pingpong.mordor.interfaces.TratamientoPedido;
import edu.pingpong.mordor.pedidos.PedidoInternacional;
import edu.pingpong.mordor.pedidos.PedidoPeligrosoOrden;
import edu.pingpong.mordor.procesadores.Oficina;
import edu.pingpong.mordor.tratamientos.TratamientoPedidoInternacional;
import edu.pingpong.mordor.tratamientos.TratamientoPedidoPeligroso;

public class App {
    public static void main( String[] args ) {
        Oficina oficina = new Oficina();

        Pedido pedido = new PedidoInternacional("Comarca", 10);
        TratamientoPedido tratamientoInt = new TratamientoPedidoInternacional(
                                                    (PedidoInternacional) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoInternacional("Mordor", 10);
        tratamientoInt = new TratamientoPedidoInternacional((PedidoInternacional) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoPeligrosoOrden("Cima de los vientos", 
                                          "No urgarse en las uñas con este puñal");
        TratamientoPedido peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        pedido = new PedidoPeligrosoOrden("Monte del destino", 
                                          "No ponerselo en el dedo");
        peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));
        
        /**
         * Los pedidos multiples se completan en el ultimo de los casos test 
         */
    }
}
