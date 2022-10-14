package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.StatusCategoria;

public class MainCategoria {
	public static void main(String[] args) {
		try {
			Categoria categoria1 = new Categoria("Informatica",StatusCategoria.ATIVA);
			System.out.println(categoria1);
			Categoria categoria2 = new Categoria("Moveis",StatusCategoria.INATIVA);
			System.out.println(categoria2);
			Categoria categoria3 = new Categoria("0Testes",StatusCategoria.ATIVA);
			System.out.println(categoria3);
		} catch (ComexException ex) {
			ex.printStackTrace();
		}
	}
}

