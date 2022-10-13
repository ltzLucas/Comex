package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainListaCliente {

	public static void main(String[] args) throws SQLException {

		
		try(Connection conexao = new ConnectionFactory().getConnection()){
			String sql = "SELECT * FROM comex.cliente";
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				try(ResultSet registros = comando.executeQuery()) {
					while (registros.next()) {
						System.out.printf("Id: %d - Nome: %s - cpf: %s - telefone: %s \n\t-- Rua: %s - Numero: %s - Complemento: %s"+
								" - Bairro %s - Cidade: %s - Uf: %s\n"
								,registros.getInt(1),registros.getString(2),registros.getString(3),registros.getString(4)
								,registros.getString(5),registros.getString(6),registros.getString(7),registros.getString(8)
								,registros.getString(9),registros.getString(10));
					}
				} 
			}
		}
	}
}
