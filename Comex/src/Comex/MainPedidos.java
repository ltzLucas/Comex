package Comex;

public class MainPedidos {
	public static void main(String[] args) {
		
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();
		System.out.println("Pedido:"+p1.getId()+"  "+p1.getData());
		System.out.println("Pedido:"+p2.getId()+"  "+p2.getData());
		System.out.println("Pedido:"+p3.getId()+"  "+p3.getData());
		
		p3.cliente = new Cliente("Lucas","109.129.039-37","4002-8922");
		
	}
}
