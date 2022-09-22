package Comex;

public class Produto {
	private static int cont;
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int qtdEstoque;
	private String categoria;
	
	
	public Produto(String nome,double precoUnitario,int qtdEstoque,String categoria) {
		this.cont++;
		this.id = this.cont;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
	}
	
	public double calculaValorTotal() {
		return precoUnitario * qtdEstoque;
	}
	
	public double calculaImposto() {
		return precoUnitario * 0.4;
	}
	
	public double valorLimpoProduto() {
		double aux = calculaImposto();
		return precoUnitario - aux;
	}
	
	public void AtualizaEstoque(int numero) {
		this.qtdEstoque = this.qtdEstoque - numero;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return this.precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidadeEstoque() {
		return this.qtdEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.qtdEstoque = quantidadeEstoque;
	}

	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
	
}

