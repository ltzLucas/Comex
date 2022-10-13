package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		try(Connection conexao = new ConnectionFactory().getConnection()){
			System.out.println("Conexao efetuada com sucesso");
		}
	}
}
