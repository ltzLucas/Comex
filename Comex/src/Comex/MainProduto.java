package Comex;

public class MainProduto {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Notebook Samsung",3523,1,"Informatica");
		ProdutoIsento produto2 = new ProdutoIsento("Clean Architecture",102.90,2,"Livors");
		Produto produto3 = new Produto("Monitor Dell 27",1889,3,"Informatica");
	
		System.out.println(produto2.calculaValorTotal());
		System.out.println("Preco Unitario: "+produto1.getPrecoUnitario()+" Valor Imposto "+produto1.calculaImposto());
		System.out.println("Preco Unitario: "+produto2.getPrecoUnitario()+" Valor Imposto "+produto2.calculaImposto());
		
		
	
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
		
		
	}
}
