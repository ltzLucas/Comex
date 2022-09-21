package Comex;

public class MainCategoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("Informatica","ativa");
		Categoria categoria2 = new Categoria("Moveis","inativa");
		Categoria categoria3 = new Categoria("Livros","ativa");
		
		System.out.println("Categoria "+categoria1.getNome() +" ("+ categoria1.getId() +" - "+ categoria1.getStatus()+")");
		System.out.println("Categoria "+categoria2.getNome() +" ("+ categoria2.getId() +" - "+ categoria2.getStatus()+")");
		System.out.println("Categoria "+categoria3.getNome() +" ("+ categoria3.getId() +" - "+ categoria3.getStatus()+")");
	}
}

