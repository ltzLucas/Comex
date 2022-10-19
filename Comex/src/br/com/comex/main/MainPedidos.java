package br.com.comex.main;

import br.com.comex.modelo.Categoria;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoDoCliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.StatusCategoria;

public class MainPedidos {
	public static void main(String[] args) {
		Cliente lucas= new Cliente("Lucass","109.129.039-37","41 9 4002-8922","Rua 123","1008","Casa1","Salgadinho","Campo Largo",EstadoDoCliente.PR);
		
		Categoria categoria1 = new Categoria("Informatica",StatusCategoria.ATIVA);
		Pedido p1 = new Pedido(lucas);
		
		Produto produto1 = new Produto("Notebook Samsung","Ultra leve",3523,1,categoria1);
		System.out.println(p1);

		ItemPedido item1 = new ItemPedido(produto1,p1);
		
		System.out.println(item1);
		
		 
	}
}
