package br.com.comex.jdbc.dao.main;

import java.sql.Connection;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.ClientesDao;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoDoCliente;

public class MainTestaClientesDao {

	public static void main(String[] args) throws SQLException {

		Cliente cliente = new Cliente("Ana Beatriz", "123.456.789-10" ,"41 9 9999-9999","Rua 123","1008","Casa1","Salgadinho","Campo Largo",EstadoDoCliente.PR);
		Cliente c2 = new Cliente("Elizandro ","111.222.333-44","40 9 1111-1111","Rua 321","999","apto ","Batel","Curitiba",EstadoDoCliente.SC);
		Connection conexao = new ConnectionFactory().getConnection();
		ClientesDao clienteDao = new ClientesDao(conexao);
		 
//		clienteDao.insere(cliente);
//		clienteDao.insere(c2);
		
		clienteDao.exclui(20);
		System.out.println(clienteDao.listarTodos());
		
	} 

}
