package br.com.comex.modelo;

public class ComexException extends RuntimeException {
	
	public ComexException (String msg) {
		super(msg);
	}
	
	public ComexException() {
		super();
	}

}
