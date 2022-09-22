package Comex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
	
		//                                Criando Clientes
		
		Cliente c1 = new Cliente("Ana", "123456789" ,"9 9999-9999");
			c1.endereco = new Endereco("Rua 123","1008","Casa1","Salgadinho","Campo Largo","PR");
		
		Cliente c2 = new Cliente("Eli","11122233344","9 1111-1111");
			c2.endereco = new Endereco("Rua 321","999","apto ","Batel","Curitiba","PR");
		
		Cliente c3 = new Cliente("Gabi","99988877755","9 1010-1010");
			c3.endereco = new Endereco("Rua Marechal","N","chacara","Bateias","Campo Largo", "PR");
			
			ArrayList<Cliente> clientes = new ArrayList<>();
			clientes.add(c1);
			clientes.add(c2);
			clientes.add(c3);
		//                              Criando Categoria	
			
		Categoria categoria1 = new Categoria("Informatica","ativa");
		Categoria categoria2 = new Categoria("Moveis","inativa");
		Categoria categoria3 = new Categoria("Livros","ativa");
		
		//                               Criando Produtos
		
		Produto produto1 = new Produto("Notebook Samsung",3523,1,"Informatica");
		ProdutoIsento produto2 = new ProdutoIsento("Clean Architecture",102.90,2,"Livors");
		Produto produto3 = new Produto("Monitor Dell 27",1889,3,"Informatica");
		ProdutoIsento produto4 = new ProdutoIsento("Galaxy S20 ",2000,4,"Informatica");
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		//                             Criando Pedido
		ArrayList<Pedido>pedidos = new ArrayList<>();
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();
		Pedido p4 = new Pedido();
		Pedido p5 = new Pedido();
		Pedido p6 = new Pedido();
		Pedido p7 = new Pedido();
		Pedido p8 = new Pedido();
		Pedido p9 = new Pedido();
		Pedido p10 = new Pedido();
		pedidos.add(p1);
		pedidos.add(p2);
		pedidos.add(p3);
		pedidos.add(p4);
		pedidos.add(p5);
		pedidos.add(p6);
		pedidos.add(p7);
		pedidos.add(p8);
		pedidos.add(p9);
		pedidos.add(p10);
		//                            Criando ItemPedido
		
		ArrayList<ItemPedido>itens = new ArrayList<>();
		ItemPedido i1 = new ItemPedido();
		ItemPedido i2 = new ItemPedido();
		ItemPedido i3 = new ItemPedido();
		ItemPedido i4 = new ItemPedido();
		ItemPedido i5 = new ItemPedido();
		itens.add(i1);
		itens.add(i2);
		itens.add(i3);
		itens.add(i4);
		itens.add(i5);
		
		
		
		
		int aux1 = 0;
		while (aux1 == 0) {
			System.out.println("1-Mostrar Clientes");
			System.out.println("2-Mostrar Produtos");
			System.out.println("3-Criar Pedido");
			System.out.println("4-Adicionar item ao pedido");
			System.out.println("5-Mostrar Itens dos pedidos");
			System.out.println("6-Mostar pedidos");
			System.out.println("7-Sair");
			int resposta = scanner.nextInt();
			switch(resposta) {
			
			case 1:
				System.out.println("\n-------------------CLIENTES---------------");
				for (Cliente cliente : clientes) {
					System.out.println("ID:"+cliente.getId()+" Nome:"+cliente.getNome()+" CPF:"+cliente.getCpf());
				}
				System.out.println("\n\n");
				System.in.read();
				break;
			case 2:
				
				System.out.println("----------------------------------------Tabela de Produtos-----------------------------------------");
				System.out.println("| ID |        NOME        | PrecoUnitario | Qtd Estoque |  Categoria  | Imposto | ValorTotalEstoque");
				System.out.println("  "+produto1.getId()+"    " +produto1.getNome()+"        "+produto1.getPrecoUnitario()
						+ "            "+ produto1.getQuantidadeEstoque()+"        "+produto1.getCategoria()+"    "+produto1.calculaImposto()
						+"         "+produto1.calculaValorTotal());
				
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("  "+produto2.getId()+"    " +produto2.getNome()+"      "+produto2.getPrecoUnitario()
				+ "             "+ produto2.getQuantidadeEstoque()+"          "+produto2.getCategoria()+"        "
				+produto2.calculaImposto()
				+"           "+produto2.calculaValorTotal());
				
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("  "+produto3.getId()+"    " +produto3.getNome()+"         "+produto3.getPrecoUnitario()
				+ "            "+ produto3.getQuantidadeEstoque()+"        "+produto3.getCategoria()+"    "+produto3.calculaImposto()
				+"          "+produto3.calculaValorTotal());
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("  "+produto4.getId()+"    " +produto4.getNome()+"             "+produto4.getPrecoUnitario()
				+ "            "+ produto4.getQuantidadeEstoque()+"        "+produto4.getCategoria()+"     "+produto4.calculaImposto()
				+"           "+produto4.calculaValorTotal()+"\n");
				System.in.read();
				
				break;
			case 3:
				
				System.out.println("Informe o ID do cliente para criar um pedido para ele:");
				int idCliente = x.nextInt();
				
				for(Cliente cliente : clientes) {
					for (Pedido pedido : pedidos) {
						if(idCliente == cliente.getId()) { /*---VERIFICA SE O ID que o usuario indicou para um cliente EXISTE---*/ 
							if(pedido.isCadastrado() == false) { // verifica se o pedido já n foi usado
								pedido.cliente = cliente;
								pedido.setCadastrado(true);
								System.out.println("Pedido:"+pedido.getId()+" Cadastrado com sucesso no(a) Cliente: "+cliente.getNome()+"\n");
								break;
							}
						} 
					}		
				}
				
				break;
			case 4:
				int cont = 0;
				System.out.println("Informe o ID do cliente para incluir um item no pedido dele:");
				int idClient = x.nextInt();
				System.out.println("Informe o ID do produto para adicionar no carrinho");
				int idProduto = x.nextInt();
				for(Produto produto : produtos) {
					for(ItemPedido item : itens) {
						for(Pedido pedido : pedidos) {
							if(pedido.isCadastrado() == true) {
								if(item.isCadastrado() == false && cont == 0 && pedido.cliente.getId() == idClient && produto.getId() == idProduto) {
									
									System.out.println("Informe a Quantidade que vc deseja comprar desse produto: ");
									System.out.println("Lembrando que apenas temos "+produto.getQuantidadeEstoque()+" no estoque");
									int qtdComprar = x.nextInt();
									
									if(qtdComprar <= produto.getQuantidadeEstoque()) {
										item.pedido = pedido;
										item.setCadastrado(true);
										item.produto = produto;
										item.setQtdComprada(qtdComprar);
									}else {
										System.out.println("Não temos essa quantidade disponivel no estoque");
									}			
									cont = 1;
									break;
								}
							}
						}
					}
				}
				
				break;
			case 5:
				for(ItemPedido item : itens) {
					if(item.isCadastrado() == true) {
						System.out.println("| IDitem |    NomeProduto    | QtdComprada | Desconto | NomeComprador | ValorTotal");
						System.out.println("    "+item.getId()+"       "+item.produto.getNome()+ "          "+item.getQtdComprada()+"       "
								+ item.getDesconto() +"         "+item.pedido.cliente.getNome()+"         "+item.TotalComDescontos());
					}
				}
				
				break;
			case 6:
				for(Pedido pedido : pedidos) {
					if(pedido.isCadastrado() == true) {
						System.out.println("Id:"+pedido.getId()+" Data:"+pedido.getData()+"  Nome do Dono do Pedido: "+pedido.cliente.getNome());
					}
				}
				
				break;
				
			case 7:
				aux1 = 1;
				break;
			default:
				
			}
		}
		
		
		
		
		
		
		
		
	}
}
