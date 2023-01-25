package es.studium.pooEjercicio3;

import java.time.LocalDateTime;

public class Principal
{

	public static void main(String[] args)
	{
		Pedido pedido1 = new Pedido(LocalDateTime.now(), "PED-01");
		Pedido pedido2 = new Pedido(LocalDateTime.now(), "PED-02");
		
		Factura factura1 = new Factura(1, "Fac-01", pedido1);
		Factura factura2 = new Factura(2, "Fac-02", pedido2);
		
		System.out.println("La factura con id: " + factura1.getIdFactura() 
							+ " y número: " + factura1.getNumeroFactura() 
							+ " está asociada al Pedido de referencia: " + factura1.getPedido().getReferencia() 
							+ " emitido con fecha: " + factura1.getPedido().getFecha());
		
		System.out.println("La factura con id: " + factura2.getIdFactura() 
		+ " y número: " + factura2.getNumeroFactura() 
		+ " está asociada al Pedido de referencia: " + factura2.getPedido().getReferencia() 
		+ " emitido con fecha: " + factura2.getPedido().getFecha());
	}

}
