package br.com.comex.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class CategoriaDao {
	
	private Connection conexao;
	
	public CategoriaDao(Connection conexao) {
		this.conexao = conexao;
		
	}

	public void insere(Categoria categoria) throws SQLException {
		
			String sql = "INSERT INTO comex.categoria (nome,status)"
					+"VALUES"
					+"(?,?)";
			 
			String[] colunaParaRetornar = { "id" };
			try (PreparedStatement comando = conexao.prepareStatement(sql,colunaParaRetornar)) {
				comando.setString(1,categoria.getNome());
				comando.setString(2,categoria.getStatus().name());
				comando.execute();
				
				ResultSet rs = comando.getGeneratedKeys();
				rs.next();
				
				categoria.setId(rs.getInt(1)); 
			}
	} 
	
	public List<Categoria> listarTodas() throws SQLException {
		String sql = "select * from comex.categoria";
		try(PreparedStatement comandoPreparado = conexao.prepareStatement(sql)){
			List<Categoria> categorias = new ArrayList<>();
			try(ResultSet registros = comandoPreparado.executeQuery()){
				while (registros.next()) {
					Categoria categoria = new Categoria (registros.getString("nome"),StatusCategoria.valueOf(registros.getString("status")));
					categoria.setId(registros.getInt("id"));
					categorias.add(categoria);
				}
			}
			return categorias;
		}
	}
	public Categoria buscaPorId(int id) throws SQLException {
		String sql = "select * from comex.categoria where id = ?";
		try(PreparedStatement comandoPreparado = conexao.prepareStatement(sql)){
			comandoPreparado.setInt(1, id);
			try(ResultSet registros = comandoPreparado.executeQuery()){
				if (registros.next()) {
					Categoria categoria = new Categoria (registros.getString("nome"),StatusCategoria.valueOf(registros.getString("status")));
					categoria.setId(registros.getInt("id"));
					return categoria;
				}
				return null;
			}
		}
	}
	public void exclui(int id) throws SQLException {
		String sql = "delete from comex.categoria where id = ?";
		try(PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setInt(1, id);
			comando.execute();
		}
	}
	public void altera(int id,String nome) throws SQLException {

		String sql = "update comex.categoria set nome = ? where id = ?";
		try(PreparedStatement comando = conexao.prepareStatement(sql)) {
			
			comando.setString(1, nome);
			comando.setInt(2, id);
			comando.execute();
		}
	}
}

	
