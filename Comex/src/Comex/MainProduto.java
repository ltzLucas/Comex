package Comex;

import java.text.DecimalFormat;

public class MainProduto {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.setId(1);
		produto1.setNome("Notebook Samsung");
		produto1.setPrecoUnitario(3523);
		produto1.setQuantidadeEstoque(1);
		produto1.setCategoria("Informatica");
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("Clean Architecture");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEstoque(2);
		produto2.setCategoria("Livros");
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Monitor Dell 27");
		produto3.setPrecoUnitario(1889);
		produto3.setQuantidadeEstoque(3);
		produto3.setCategoria("Informatica");
		
		
		
		System.out.println("----------------------------------------Tabela de Produtos-----------------------------------------");
		System.out.println("| ID |        NOME        | PrecoUnitario | Qtd Estoque |  Categoria  | Imposto | ValorTotalEstoque");
		System.out.println("  "+produto1.getId()+"    " +produto1.getNome()+"        "+produto1.getPrecoUnitario()
				+ "            "+ produto1.getQuantidadeEstoque()+"        "+produto1.getCategoria()+"    "+produto1.calculaImposto()
				+"         "+produto1.calculaValorTotal());
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("  "+produto2.getId()+"    " +produto2.getNome()+"      "+produto2.getPrecoUnitario()
		+ "             "+ produto2.getQuantidadeEstoque()+"          "+produto2.getCategoria()+"       "
		+new DecimalFormat(".##").format(produto2.calculaImposto())
		+"          "+produto2.calculaValorTotal());
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("  "+produto3.getId()+"    " +produto3.getNome()+"         "+produto3.getPrecoUnitario()
		+ "            "+ produto3.getQuantidadeEstoque()+"        "+produto3.getCategoria()+"    "+produto3.calculaImposto()
		+"         "+produto3.calculaValorTotal());
		
		
	}
}
