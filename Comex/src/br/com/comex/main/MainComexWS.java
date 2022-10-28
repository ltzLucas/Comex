package br.com.comex.main;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoDoCliente;
import br.com.comex.ws.ComexWS;

public class MainComexWS {

	public static void main(String[] args) throws SQLException {

		ComexWS service = new ComexWS();
		String url = "http://localhost:8080/ComexWS";
		
		System.out.println("Service rodando: "+ url + "?wsdl");
		Endpoint.publish(url, service);
		
		
//		Cliente cliente = new Cliente("Lucas lima","109.129.039-37","41 9 9111-0168","Rua123","1008","Casa Rosa","Salgadinho","Campo Largo",EstadoDoCliente.PR);
//		service.adicionarCliente(cliente);
	}

}
