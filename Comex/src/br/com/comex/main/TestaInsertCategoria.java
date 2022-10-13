package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class TestaInsertCategoria {

	public static void main(String[] args) throws SQLException {

		String nome = "Moveis";
		String status = "ATIVA";
		
		String sql = "INSERT INTO comex.categoria" +
				"(nome,status)"
				+"VALUES"
				+ "(?,?)";
		
		Connection conexao = new ConnectionFactory().getConnection();
		
		try (PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setString(1, nome);
			comando.setString(2, status);
			
			comando.execute();
			
		};
		
		conexao.close();
	}

}
