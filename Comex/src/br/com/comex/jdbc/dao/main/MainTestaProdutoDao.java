package br.com.comex.jdbc.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.ProdutoDao;

public class MainTestaProdutoDao {

	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().getConnection();
		
		
		
		//Produto produto = new Produto("Computador", 2000, 5, );
		ProdutoDao produtodao = new ProdutoDao(conexao);
		
		System.out.println(produtodao.listaTudo());
		
	}

}
