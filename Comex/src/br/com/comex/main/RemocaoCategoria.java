package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.comex.jdbc.ConnectionFactory;

public class RemocaoCategoria {
	
	public static void main(String[] args) throws SQLException {
		
		try(Connection conexao = new ConnectionFactory().getConnection()){
			String sql = "DELETE FROM comex.categoria";
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.execute();
				System.out.println("Categorias deletedas com sucesso");
			};
		}
		
	}
}
