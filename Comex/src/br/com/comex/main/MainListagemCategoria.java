package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		
		try(Connection conexao = new ConnectionFactory().getConnection()){
			String sql = "select * from comex.categoria";
			try(PreparedStatement comandoPreparado = conexao.prepareStatement(sql)){
				try(ResultSet registros = comandoPreparado.executeQuery()){
					while (registros.next()) {
						System.out.printf("Id: %s ,Nome %s, Status: %s \n",registros.getInt("id"),registros.getString("nome"),
								registros.getString("status")); 
					}
				}
			}
		}
	}
}
