package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {

		List<Categoria> categorias = new ArrayList<Categoria>();
		
		categorias.add(new Categoria("Informatica",StatusCategoria.ATIVA));
		categorias.add(new Categoria("Moveis",StatusCategoria.INATIVA));
		categorias.add(new Categoria("Livros",StatusCategoria.ATIVA));
		categorias.add(new Categoria("testes",StatusCategoria.INATIVA));
		
		Connection conexao = new ConnectionFactory().getConnection();
		
		String sql = "INSERT INTO comex.categoria (nome,status)"
				+"VALUES"
				+"(?,?)";
				 
		try (PreparedStatement comando = conexao.prepareStatement(sql)) {
			for (Categoria categoria : categorias) {
				
				comando.setString(1,categoria.getNome());
				comando.setString(2,categoria.getStatus().name());
				
				comando.execute();
				
				System.out.println("Categoria Adicionada com Sucesso: \n\t"+categoria);
			}
		}
		conexao.close();
		
	}
}
