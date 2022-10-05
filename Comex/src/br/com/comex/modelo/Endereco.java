package br.com.comex.modelo;

public class Endereco {
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private EstadoDoCliente estado;
	
	public Endereco(String rua, String numero, String complemento, String bairro, String cidade, EstadoDoCliente estado) {
		
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
		
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
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


	@Override
	public String toString() {
		return "Rua:  " + rua + " Numero: " + numero + " Complemento: " + complemento + " Bairro: " + bairro
				+ " Cidade: " + cidade + " Estado: " + estado + "\n\n";
	}
	
	
	
	
	
	
	
	
	
	
	
}

