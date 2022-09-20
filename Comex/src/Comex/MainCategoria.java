package Comex;

public class MainCategoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria(1,"Informatica","Ativa");
		System.out.println("Categoria "+categoria1.getNome() +" "+ categoria1.getId() +" - "+ categoria1.getStatus());
	}
}

