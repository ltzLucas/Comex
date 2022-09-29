package br.com.comex.main;

import br.com.comex.modelo.Categoria;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.StatusCategoria;

public class MainProduto {
	public static void main(String[] args) {
		
		try {
			Categoria categoria1 = new Categoria("Informatica",StatusCategoria.ATIVA);
			Categoria categoria2 = new Categoria("Moveis",StatusCategoria.INATIVA);
			Categoria categoria3 = new Categoria("Livros",StatusCategoria.ATIVA);
			
			Produto produto1 = new Produto("Notebook Samsung",3523,2,categoria1);
			ProdutoIsento produto2 = new ProdutoIsento("Clean Architecture",102.90,2,categoria3);
			Produto produto3 = new Produto("Monitor Dell 27",1889,3,categoria1);
			ProdutoIsento produto4 = new ProdutoIsento("Galaxy S20 ",2000,4,categoria1);
			
			
			
			System.out.println(produto1);
			System.out.println(produto2);
			System.out.println(produto3);
			System.out.println(produto4);
			
			
			
			
			
//			System.out.println("----------------------------------------Tabela de Produtos-----------------------------------------");
//			System.out.println("| ID |        NOME        | PrecoUnitario | Qtd Estoque |  Categoria  | Imposto | ValorTotalEstoque");
//			
//			System.out.println("---------------------------------------------------------------------------------------------------");
//			System.out.println("  "+produto2.getId()+"    " +produto2.getNome()+"      "+produto2.getPrecoUnitario()
//			+ "             "+ produto2.getQuantidadeEstoque()+"          "+produto2.categoria.getNome()+"        "
//			+produto2.calculaImposto()
//			+"           "+produto2.calculaValorTotal());
//			
//			System.out.println("---------------------------------------------------------------------------------------------------");
//			System.out.println("  "+produto3.getId()+"    " +produto3.getNome()+"         "+produto3.getPrecoUnitario()
//			+ "            "+ produto3.getQuantidadeEstoque()+"        "+produto3.categoria.getNome()+"    "+produto3.calculaImposto()
//			+"          "+produto3.calculaValorTotal());
//			System.out.println("---------------------------------------------------------------------------------------------------");
//			System.out.println("  "+produto4.getId()+"    " +produto4.getNome()+"             "+produto4.getPrecoUnitario()
//			+ "            "+ produto4.getQuantidadeEstoque()+"        "+produto4.categoria.getNome()+"     "+produto4.calculaImposto()
//			+"           "+produto4.calculaValorTotal());
			
		} catch( IllegalArgumentException ex){
			System.out.println("DEU BOSTA");
		}
		
		
	}
}
