package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;

public class TotalCategoria {

	
	
	public int Total(List<PedidoCsv> pedido) {
		List<String> categoriasQueJaApareceram = new ArrayList<>();
		
		for (PedidoCsv pedidos : pedido) {
			String categoria = pedidos.getCategoria();
			if (!categoriasQueJaApareceram.contains(categoria)) { 
				categoriasQueJaApareceram.add(categoria);
			}
		}
		return categoriasQueJaApareceram.size();
	}
}
