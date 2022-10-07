package br.com.comex.csv;

import java.util.List;

public class MontanteTotalVendas {

	public double total(List<PedidoCsv> pedido) {
		double total = 0;
		for (PedidoCsv pedidoCsv : pedido) {
			 total += Double.parseDouble(pedidoCsv.getPreco()) * Integer.parseInt(pedidoCsv.getQuantidade());
		}
		return total;
	}
}
