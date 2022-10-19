package br.com.comex.modelo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
	private static int cont;
	private int id;
	private String data;
	private Cliente cliente;
	
	public Pedido(Cliente cliente) {
		LocalDate hoje = LocalDate.now(); //Pega a data local
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Cria um formato
		String hojeFormatado = hoje.format(formatter); // Formata a data
		this.cont++;
		this.id = this.cont;
		this.data = hojeFormatado;
		this.cliente = cliente;
	}
	
	public Pedido(String data,Cliente cliente) {
   
		this.data = data;
		this.cliente = cliente;
	}
  
	public int getId() {
		return id;
	}
	public String getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Id " + id + " Data " + data + " Cliente " +" \n     "+ cliente;
	}



	
	
	
	
}
