package br.com.comex.modelo;

public class Produto {
	private static int cont;
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int qtdEstoque;
	Categoria categoria;
	
	
	public Produto(String nome,double precoUnitario,int qtdEstoque, Categoria categoria) {
		if(nome.length() < 5) {
			throw new IllegalArgumentException("Nome precisa ser maior que 4 digitos");
		}
		if(precoUnitario <= 0) {
			throw new IllegalArgumentException("Preco nao pode ser negativo");
		}
		if(qtdEstoque <= 0) {
			throw new IllegalArgumentException("QtdEstoque nao pode ser negativo");
		}
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria nao pode ser null");
		}
		if(Character.isDigit(nome.charAt(0))) {
			throw new IllegalArgumentException("Primeiro Digito do nome nao pode ser um numero");
		}
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto: " + id + " Nome " + nome + " PrecoUnitario " + precoUnitario
				+ " qtdEstoque " + qtdEstoque + "\n ";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

