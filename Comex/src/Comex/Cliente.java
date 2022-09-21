package Comex;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	Endereco endereco;
	
	public Cliente(int id, String nome, String cpf, String telefone) {
		this.id = id;
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
