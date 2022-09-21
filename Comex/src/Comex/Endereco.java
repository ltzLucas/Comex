package Comex;

public class Endereco {
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado) {
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
	public String getEstado() {
		return estado;
	}


	@Override
	public String toString() {
		return " Rua= " + rua + ", Numero= " + numero + ", Complemento= " + complemento + ", Bairro= " + bairro
				+ ", Cidade= " + cidade + ", Estado= " + estado + "\n\n";
	}
	
	
	
	
	
	
	
	
	
	
	
}

