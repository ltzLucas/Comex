package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainRemocaoProduto {

	public static void main(String[] args) throws SQLException {
		
		try(Connection conexao = new ConnectionFactory().getConnection()) {
			int id = 1;
			String sql = "DELETE FROM comex.produto WHERE id =" + id;
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.execute();
				System.out.println("Quantidade de linhas que foram deletadas: "+comando.getUpdateCount());
			}
		}
	}
}
