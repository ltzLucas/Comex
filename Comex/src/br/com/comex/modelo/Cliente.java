package br.com.comex.modelo;


public class Cliente {
	private static int cont;
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private EstadoDoCliente estado;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String cpf, String telefone, String rua, String numero, String complemento, String bairro, String cidade, EstadoDoCliente estado) {
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
		if(rua.length() <= 5) {
			throw new ComexException("Rua deve ser maior que 5");
		}
		if(numero.length() <= 1) {
			throw new ComexException("Numero deve ser maior que 1 caracter");
		}
		if(bairro.length() <= 1 ) {
			throw new ComexException("Bairro deve ser maior que 1 caracter");
		}
		if (cidade.length() <= 1) {
			throw new ComexException("Cidade deve ser maior que 1 caracter");
		}
		
		cont++;
		this.id = cont;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
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
	
	
	public void setId(int id) {
		this.id = id;
	}

	public static int getCont() {
		return cont;
	}
	public String getRua() {
		return rua;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public EstadoDoCliente getEstado() {
		return estado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(EstadoDoCliente estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", rua=" + rua
				+ ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]\n";
	}

	

	

	

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
