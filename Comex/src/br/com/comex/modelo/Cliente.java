package br.com.comex.modelo;


public class Cliente {
	private static int cont;
	private int id;
	public String nome;
	private String cpf;
	private String telefone;
	Endereco endereco;
	
	public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
		if (nome.length() <= 5) {
			throw new IllegalArgumentException("Nome deve ser maior que 5");
		}
		boolean valido = cpf.matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d");
		if (valido == false) {
			throw new IllegalArgumentException("Preencha o cpf nesse formato: 000.000.000-00");
		}
		if (telefone != null) {
			boolean Tvalido = telefone.matches("\\d\\d \\d \\d\\d\\d\\d-\\d\\d\\d\\d");
			if (Tvalido == false) {
				throw new IllegalArgumentException("Preencha o telefone nesse formato: 00 0 0000-0000");
			}
		}
		if(Character.isDigit(nome.charAt(0))) {
			throw new IllegalArgumentException("Primeiro Digito do nome nao pode ser um numero");
		}
		
		cont++;
		this.id = cont;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "Id " + this.id + " Nome" + this.nome + " Cpf " + this.cpf + " Telefone " + this.telefone + "\n    Endereco: "
				+ this.endereco ;
	}

	

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
