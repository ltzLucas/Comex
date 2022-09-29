package br.com.comex.main;

public class testess {

	public static void main(String[] args) {
		
		
		
		String telefone = "41 9 0000-0000";
		
		
		boolean valido = telefone.matches("\\d\\d \\d \\d\\d\\d\\d-\\d\\d\\d\\d");
		System.out.println("Retorno = "+valido + telefone);
		
		

	}

}
