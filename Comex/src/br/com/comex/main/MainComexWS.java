package br.com.comex.main;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import br.com.comex.ws.ComexWS;

public class MainComexWS {

	public static void main(String[] args) throws SQLException {

		ComexWS service = new ComexWS();
		String url = "http://localhost:8080/ComexWS";
		
		System.out.println("Service rodando: "+ url + "?wsdl");
		Endpoint.publish(url, service);
	}

}
