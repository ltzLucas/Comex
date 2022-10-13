package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.comex.jdbc.ConnectionFactory;

public class MainRemocaoCliente {

	
	public static void main(String[] args) throws SQLException {
		try(Connection conexao = new ConnectionFactory().getConnection()) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Informe o ID do cliente que deseja excluir");
			int id = scanner.nextInt();
			String sql = "DELETE FROM comex.cliente WHERE id =" + id;
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.execute();
				System.out.println("Quantidade de linhas que foram deletadas: "+comando.getUpdateCount());
			}
			scanner.close();
		}
	}
}
