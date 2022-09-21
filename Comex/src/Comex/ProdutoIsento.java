package Comex;



public class ProdutoIsento extends Produto {
	
	public ProdutoIsento(String nome, double precoUnitario, int qtdEstoque, String categoria) {
		super(nome, precoUnitario, qtdEstoque, categoria);
	}

	
	public double calculaImposto() {
		return 0;
	}
	
}



