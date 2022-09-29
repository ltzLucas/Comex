package br.com.comex.modelo;


import java.io.IOException;
import java.util.ArrayList;



public class Print {
	
	public void printProdutos(Produto produto1,Produto produto2,Produto produto3,Produto produto4, Produto produto5) throws IOException {
		System.out.println("----------------------------------------Tabela de Produtos-----------------------------------------");
		System.out.println("| ID |        NOME        | PrecoUnitario | Qtd Estoque |  Categoria  | Imposto | ValorTotalEstoque");
		System.out.println("  "+produto1.getId()+"    " +produto1.getNome()+"        "+produto1.getPrecoUnitario()
				+ "            "+ produto1.getQuantidadeEstoque()+"        "+produto1.categoria.getNome()+"    "+produto1.calculaImposto()
				+"         "+produto1.calculaValorTotal());
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("  "+produto2.getId()+"    " +produto2.getNome()+"      "+produto2.getPrecoUnitario()
		+ "             "+ produto2.getQuantidadeEstoque()+"          "+produto2.categoria.getNome()+"        "
		+produto2.calculaImposto()
		+"           "+produto2.calculaValorTotal());
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("  "+produto3.getId()+"    " +produto3.getNome()+"         "+produto3.getPrecoUnitario()
		+ "            "+ produto3.getQuantidadeEstoque()+"        "+produto3.categoria.getNome()+"    "+produto3.calculaImposto()
		+"          "+produto3.calculaValorTotal());
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("  "+produto4.getId()+"    " +produto4.getNome()+"             "+produto4.getPrecoUnitario()
		+ "            "+ produto4.getQuantidadeEstoque()+"        "+produto4.categoria.getNome()+"     "+produto4.calculaImposto()
		+"           "+produto4.calculaValorTotal()+"\n");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("  "+produto5.getId()+"    " +produto5.getNome()+"             "+produto5.getPrecoUnitario()
		+ "            "+ produto5.getQuantidadeEstoque()+"        "+produto5.categoria.getNome()+"     "+produto5.calculaImposto()
		+"           "+produto5.calculaValorTotal()+"\n\n");
		
	}
	
	
	public void printItensPedidos(ArrayList<ItemPedido> itens) {
		for(ItemPedido item : itens) {
			if(item.isCadastrado() == true) {
				item.CalculaDesconto();
				System.out.println("| IDitem |    NomeProduto    | QtdComprada | Desconto | NomeComprador | ValorTotal");
				System.out.println("    "+item.getId()+"       "+item.produto.getNome()+ "          "+item.getQtdComprada()+"       "
						+ item.getDesconto() +"         "+item.pedido.cliente.getNome()+"         "+item.TotalComDescontos());
			}
		}
	}
	
	public void printPedidos(ArrayList<Pedido>pedidos) {
		for(Pedido pedido : pedidos) {
			if(pedido.isCadastrado() == true) {
				System.out.println("-----------------------------Pedidos-----------------------------");
				System.out.println("Id:"+pedido.getId()+" Data:"+pedido.getData()+"   Nome do Dono do Pedido: "+pedido.cliente.getNome()+"\n");
			}
		}
	}
	
	public void printClientes(ArrayList<Cliente>clientes) throws IOException {
		System.out.println("\n-------------------CLIENTES---------------");
		for (Cliente cliente : clientes) {
			System.out.println("ID:"+cliente.getId()+" Nome:"+cliente.getNome()+" CPF:"+cliente.getCpf());
		}
		System.out.println("\n\n");
	}
}
