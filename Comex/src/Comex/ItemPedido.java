package Comex;

public class ItemPedido {
	private static int cont;
	private int id;
	private int qtdComprada;
	Produto produto;
	Pedido pedido;
	private double desconto;
	private String tipoDesconto = "Nenhum";
	private boolean cadastrado;
	
	
	public ItemPedido() {
		this.cont++;
		this.id = this.cont;
	}
	
	
	
	public double TotalSemDescontos() {
		return this.produto.getPrecoUnitario() * qtdComprada;
	}
	public void CalculaDesconto() {
		if(tipoDesconto == "Promocao") {
			this.desconto = 0.2;
		} 
		else if (qtdComprada > 10) {
			this.desconto = 0.1;
		}
	}
	
	public double TotalComDescontos() {
		if(this.desconto == 0) {
			return TotalSemDescontos();
		}
		return (this.desconto * TotalSemDescontos());
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
	
	
	
	
	
}
