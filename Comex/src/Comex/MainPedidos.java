package Comex;

public class MainPedidos {
	public static void main(String[] args) {
		
		Pedido p1 = new Pedido();
	
		Cliente lucas= new Cliente("Lucas","109.129.039-37","4002-8922");
		p1.cliente = lucas;
		
		Produto produto1 = new Produto("Notebook Samsung",3523,1,"Informatica");
		
		System.out.println("Pedido:"+p1.getId()+"  "+p1.getData());
		System.out.println("Nome CLiente:"+p1.cliente.getNome()+" CPF:"+p1.cliente.getCpf()+" Id CLiente:"+p1.cliente.getId());

		ItemPedido item1 = new ItemPedido();
		
		item1.pedido = p1;
		item1.produto = produto1;
		System.out.println(item1.pedido.cliente.getNome());
		System.out.println(item1.produto.getNome());
		
		
	}
}
