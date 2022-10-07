package br.com.comex.csv;

import java.util.List;

public class PedidoMaisBaratoEMaisCaro  {

	public void exec(List<PedidoCsv> pedido) {
		
		//Professor não tinha certeza qual método usar ai tambem criei um comparetor para Classificar o mais barato e o mais caro
		
		double max = Double.MIN_VALUE;
		String nomeMax = "";
		double min = Double.MAX_VALUE;
		String nomeMin = "";
		for (PedidoCsv pedidoCsv : pedido) {
			
			if(Double.parseDouble(pedidoCsv.getPreco())  * Integer.parseInt(pedidoCsv.getQuantidade())  > max) {
				max = Double.parseDouble(pedidoCsv.getPreco())  * Integer.parseInt(pedidoCsv.getQuantidade());
				nomeMax = pedidoCsv.getProduto();
			}
			if(Double.parseDouble(pedidoCsv.getPreco())  * Integer.parseInt(pedidoCsv.getQuantidade()) < min) {
				min = Double.parseDouble(pedidoCsv.getPreco())  * Integer.parseInt(pedidoCsv.getQuantidade());
				nomeMin = pedidoCsv.getProduto();
			}
		}
		System.out.println("Pedido mais barato: " + min + " (" + nomeMin + ")");
		System.out.println("Pedido mais caro: " + max + " (" + nomeMax + ")");
	}

	
	
}
