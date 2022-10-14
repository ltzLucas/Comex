package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {

		try(Connection conexao = new ConnectionFactory().getConnection()){
			String sql = "DELETE FROM comex.categoria WHERE status ='INATIVA'";
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.execute();
				System.out.println("Quantidade de linhas de categorias Deletadas: " + comando.getUpdateCount() );
			}
		}
	}
 
}
