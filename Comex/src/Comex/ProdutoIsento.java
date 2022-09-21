package Comex;

public class ProdutoIsento {
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int qtdEstoque;
	private String categoria;
	
	public ProdutoIsento(int id,String nome,double precoUnitario,int qtdEstoque,String categoria) {
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
	}
	public double calculaValorTotal() {
		return this.precoUnitario * this.qtdEstoque;
	}
	
	public double imposto() {
		return 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	}



