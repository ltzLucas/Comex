package Comex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente("Ana", "123456789" ,"9 9999-9999");
		
		c1.endereco = new Endereco("Rua 123","1008","Casa1","Salgadinho","Campo Largo","PR");
		
		Cliente c2 = new Cliente("Eli","11122233344","9 1111-1111");
	
		c2.endereco = new Endereco("Rua 321","999","apto ","Batel","Curitiba","PR");
		
		Cliente c3 = new Cliente("Gabi","99988877755","9 1010-1010");
		
		c3.endereco = new Endereco("Rua Marechal","N","chacara","Bateias","Campo Largo", "PR");
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		
			
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
		
		
		
	}
}
