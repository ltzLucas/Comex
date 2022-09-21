package Comex;

public class Categoria {
	private static int cont;
	private int id;
	private String nome;
	private String status = "INATIVA";
	
	public Categoria(String nome,String status) {
		this.nome = nome;
		this.status = status;	
		this.cont++;
		this.id = this.cont;
	}
	
	
	
	public  int getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	public String getStatus() {
		return this.status;
	}
	
	
}
