package br.com.comex.csv;

import java.util.List;

public class TotalProdutosVendidos {

	
	public int total(List<PedidoCsv> pedido) {
		int total = 0;
		for (PedidoCsv pedidoCsv : pedido) {
			total += Integer.parseInt(pedidoCsv.getQuantidade());
		}
		return total;
	}
}
