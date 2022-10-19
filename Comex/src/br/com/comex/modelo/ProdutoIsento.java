package br.com.comex.modelo;



public class ProdutoIsento extends Produto {
	
	public ProdutoIsento(String nome,String descricao, double precoUnitario, int qtdEstoque,Categoria categoria) {
		super(nome, descricao, precoUnitario, qtdEstoque,categoria);
	}

	
	public double calculaImposto() {
		return 0;
	}
}



