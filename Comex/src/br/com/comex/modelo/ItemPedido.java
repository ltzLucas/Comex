package br.com.comex.modelo;

public class ItemPedido {
	private static int cont;
	private int id;
	private int qtdComprada;
	private Produto produto;
	private Pedido pedido;
	private double desconto;
	private String tipoDesconto = "Nenhum";
	private boolean cadastrado;
	
	
	public ItemPedido(Produto produto,Pedido Pedido) {
		this.cont++;
		this.id = this.cont;
		this.produto = produto;
		this.pedido = pedido;
	}
	
	public double TotalSemDescontos() {
		return this.produto.getPrecoUnitario() * qtdComprada;
	}
	
	public void CalculaDesconto() {
		if(tipoDesconto.equals("Promocao")) {
			this.desconto = 0.2;
		} 
		else if (qtdComprada >= 10) {
			this.desconto = 0.1;
		}
	}
	
	public double TotalComDescontos() {
		if(this.desconto == 0) {
			return TotalSemDescontos();
		}
		return  TotalSemDescontos() - (this.desconto * TotalSemDescontos());
	}
	
	
	public void setTipoDesconto(String tipoDesconto) {
		this.tipoDesconto = tipoDesconto;
	}

	public int getId() {
		return id;
	}
	public int getQtdComprada() {
		return qtdComprada;
	}
	public Produto getProduto() {
		return produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public double getDesconto() {
		return desconto;
	}
	public String getTipoDesconto() {
		return tipoDesconto;
	}
	public boolean isCadastrado() {
		return cadastrado;
	}
	public void setCadastrado(boolean cadastrado) {
		this.cadastrado = cadastrado;
	}

	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}

	@Override
	public String toString() {
		return "Id: " + id + " QtdComprada: " + qtdComprada + " Produto: " + produto.getNome() 	+ " Desconto " + desconto;
	}
	
	
	
	
	
}
