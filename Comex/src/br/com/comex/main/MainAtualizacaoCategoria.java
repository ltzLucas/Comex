package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.comex.jdbc.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {

		try(Connection conexao = new ConnectionFactory().getConnection()){
			String nomeAntigo,NomeNovo;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Informe o nome da categoria que vc deseja mudar");
			nomeAntigo = scanner.next();
			System.out.println("Informe o novo nome que vc deseja usar");
			NomeNovo = scanner.next();
			
			String sql = "UPDATE comex.categoria SET nome ="+ "'" + NomeNovo + "'" 
					+"WHERE nome =" + "'" + nomeAntigo + "'";
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.execute();
				System.out.println("Execuda com sucesso");
			};
			
			//--------------------------------------------------------------------------
			
//			String sql = "UPDATE comex.categoria SET nome = 'LIVROS_TECNICOS' WHERE nome = 'Livros'";
//			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
//				comando.execute();
//				System.out.println("Execuda com sucesso");
//			};
		}
		
	}

}
