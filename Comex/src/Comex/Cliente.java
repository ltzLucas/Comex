package Comex;

public class Cliente {
	private static int cont;
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	Endereco endereco;
	
	public Cliente(String nome, String cpf, String telefone) {
		this.cont++;
		this.id = this.cont;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
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
		return "Id=" + this.id + ", Nome=" + this.nome + ", Cpf=" + this.cpf + ", Telefone=" + this.telefone + "\n"
				+ this.endereco + " ";
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
}
