package Comex;



public class ProdutoIsento extends Produto {
	
	public ProdutoIsento(int id, String nome, double precoUnitario, int qtdEstoque, String categoria) {
		super(id, nome, precoUnitario, qtdEstoque, categoria);
	}

	
	public double calculaImposto() {
		return 0;
	}
	
}



