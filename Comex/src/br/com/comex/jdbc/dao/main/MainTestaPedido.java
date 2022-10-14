package br.com.comex.jdbc.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.ClientesDao;
import br.com.comex.jdbc.dao.PedidoDao;
import br.com.comex.modelo.Pedido;

public class MainTestaPedido {

	public static void main(String[] args) throws SQLException {

		
		Connection conexao = new ConnectionFactory().getConnection();
		
		ClientesDao clientedao = new ClientesDao(conexao);
		PedidoDao pedidodao = new PedidoDao(conexao);
	
		Pedido pedido = new Pedido(clientedao.buscaPorId(24));
		
		//pedidodao.Insere(pedido);
		//pedidodao.exclui(16);
		pedidodao.alteraData("10/10/10", 8);
		
		System.out.println(pedidodao.listarTodos());
	}
}
