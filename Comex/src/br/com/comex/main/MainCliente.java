package br.com.comex.main;
import java.util.ArrayList;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.Endereco;
import br.com.comex.modelo.EstadoDoCliente;

public class MainCliente {

	public static void main(String[] args) {
		try {
			ArrayList<Cliente> clientes = new ArrayList<>();
				Endereco endereco = new Endereco("Rua 123","1008","Casa1","Salgadinho","Campo Largo",EstadoDoCliente.PR);
			Cliente c1 = new Cliente("Ana Beatriz", "123.456.789-10" ,"41 9 9999-9999",endereco);
			clientes.add(c1);
				Endereco endereco1 = new Endereco("Rua 321","999","apto ","Batel","Curitiba",EstadoDoCliente.SC);
			Cliente c2 = new Cliente("Elizandro ","111.222.333-44","40 9 1111-1111",endereco1);
			clientes.add(c2);
				Endereco endereco2 = new Endereco("Rua Marechal","10","chacara","Bateias","Campo Largo",EstadoDoCliente.PR);
			Cliente c3 = new Cliente("Gabi Brasil","999.888.777-55","41 9 1010-1010",endereco2);
			clientes.add(c3);
			
			System.out.println(clientes);
		}catch (ComexException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: "+msg);
			ex.printStackTrace();
		}
	}

}
