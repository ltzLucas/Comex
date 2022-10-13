package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.comex.jdbc.ConnectionFactory;

public class MainAtualizaCliente {

	public static void main(String[] args) throws SQLException {

		try(Connection conexao = new ConnectionFactory().getConnection()) {
			String nomeAntigo,NomeNovo;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Informe o que vc deseja mudar");
			nomeAntigo = scanner.next();
			System.out.println("Informe o que vc deseja usar");
			NomeNovo = scanner.next();
			
			String sql = "UPDATE comex.cliente SET nome = "+ "'" + NomeNovo + "'" 
					+"WHERE nome =" + "'" + nomeAntigo + "'";
			
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.execute();
				System.out.println("Quantidade de linhas que foram Atualizadas: " + comando.getUpdateCount());
			}
			scanner.close();
		}
	}
} 
