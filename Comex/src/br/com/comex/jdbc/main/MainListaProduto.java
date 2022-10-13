package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainListaProduto {

	public static void main(String[] args) throws SQLException {

		try(Connection conexao = new ConnectionFactory().getConnection()){
			String sql = "SELECT * FROM comex.produto";
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				try(ResultSet registros = comando.executeQuery()) {
					while (registros.next()) {
						System.out.printf("Id: %d - Nome: %s - Descricao: %s - PrecoUni: %f - Qtd: %d - Categoria: %d - Tipo: %s\n"
								,registros.getInt(1),registros.getString(2),registros.getString(3),registros.getFloat(4)
								,registros.getInt(5),registros.getInt(6),registros.getString(7));
					
					}
				}
			}
		}
	}
}
