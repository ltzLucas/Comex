package br.com.comex.main;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.comex.csv.LeitorPedidoCsv;
import br.com.comex.csv.MontanteTotalVendas;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.PedidoMaisBaratoEMaisCaro;
import br.com.comex.csv.TotalCategoria;
import br.com.comex.csv.TotalProdutosVendidos;

public class MainLeitorPedidoCsv {

	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidoCsv leitorPedidoCsv = new LeitorPedidoCsv();
		TotalProdutosVendidos totalProdutos = new TotalProdutosVendidos();
		TotalCategoria totalCategoria = new TotalCategoria();
		MontanteTotalVendas montante = new MontanteTotalVendas();
		PedidoMaisBaratoEMaisCaro PedidoCaroBarato = new PedidoMaisBaratoEMaisCaro();
		
		List<PedidoCsv> lstPedidos = leitorPedidoCsv.lerPedidoCsv();
		List<Double> lstMulti = new ArrayList<Double>();
		Comparator<Double> porPrecoQuantidade = new ComparetorMaisBaratoCaro();
		
		NumberFormat aux = NumberFormat.getCurrencyInstance();
		
		System.out.println("Total de pedidos: "+lstPedidos.size());
		System.out.println("Total de produtos vendidos: "+totalProdutos.total(lstPedidos));
		System.out.println("Total de Categorias: "+ totalCategoria.Total(lstPedidos));
		System.out.println("Montante de Vendas: "+ aux.format(montante.total(lstPedidos)) );
		//ORDENAÇÃO POR UMA CLASS
		
		//PedidoCaroBarato.exec(lstPedidos);
		
		//ORDENAÇãO USANDO COMPARETOR
		
		for(PedidoCsv pedidoCsv : lstPedidos) {
			lstMulti.add((Double.parseDouble(pedidoCsv.getPreco()) * Integer.parseInt(pedidoCsv.getQuantidade())));
		}
		
		lstMulti.sort(porPrecoQuantidade);
		
		for (PedidoCsv pedidoCsv : lstPedidos) {
			if(lstMulti.get(0) == Double.parseDouble(pedidoCsv.getPreco()) * Integer.parseInt(pedidoCsv.getQuantidade()) )  {
				System.out.println("Categoria mais barato: " + aux.format(lstMulti.get(0)) + " (" + pedidoCsv.getProduto() + ")");
			} 
			if(lstMulti.get(lstMulti.size() - 1) == Double.parseDouble(pedidoCsv.getPreco()) * Integer.parseInt(pedidoCsv.getQuantidade())) {
				System.out.println("Categoria mais cara: " +aux.format(lstMulti.get(lstMulti.size() - 1))  + " (" + pedidoCsv.getProduto()+ ")");
			}
		}
	}
}
