package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {
	private static int cont = 20;
	private int id;
	private String nome;
	private StatusCategoria status;
	
	
	
	Categoria() {
		super();
	}
	
	public Categoria(int id,String nome,StatusCategoria status) {
		if(id != cont) {
			throw new ComexException("Argumentos passados invalidos deve-se passar o id correto");
		}
		if(nome == null) {
			throw new ComexException("Nome nao pode ser nulo");
		}
		if(Character.isDigit(nome.charAt(0))) {
			throw new ComexException("Primeiro Digito do nome não pode ser um numero");
		}
		this.id = id;
		this.nome = nome;
		this.status = status;
		cont++;
		 
	}
	
	public Categoria(String nome,StatusCategoria status) {
		if(nome.length() <= 3) {
			throw new ComexException("Argumentos passados invalidos"); 
		}
		if(Character.isDigit(nome.charAt(0))) {
			throw new ComexException("Primeiro Digito do nome nao pode ser um numero");
		}
		
		this.nome = nome;
		this.status = status;	
		cont++;
		this.id = this.cont;
	}

	public  int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusCategoria getStatus() {
		return status;
	}
	public void setStatus(StatusCategoria status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Id "+ this.id + " Nome " + this.nome +" Status "+ this.status+ "\n";
	}
	
	
	
	
	
	
	
	
}
