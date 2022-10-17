package br.com.comex.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoDoCliente;
import br.com.comex.modelo.Produto;

public class ProdutoDao {

	private Connection conexao;

	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	public void insere(Produto produto) throws SQLException {
		
		String sql = "INSERT INTO comex.produto (nome,preco_unitario,quantidade_estoque,categoria_id)"
				+"VALUES"
				+"(?,?,?,?)";
		String[] colunaParaRetornar = { "id" };
		try(PreparedStatement comando = conexao.prepareStatement(sql)){
			comando.setString(1,produto.getNome());
			comando.setDouble(2,produto.getPrecoUnitario());
			comando.setInt(3, produto.getQuantidadeEstoque());
			comando.setInt(4, produto.getCategoria().getId());
			comando.execute();
			
			ResultSet rs = comando.getGeneratedKeys();
			rs.next();
			produto.setId(rs.getInt("id"));
		}
	}
	
	
	public List<Produto> listaTudo() throws SQLException {
		
		String sql = "SELECT * FROM comex.produto";
		List<Produto> produtos = new ArrayList<>();
		try (PreparedStatement comando = conexao.prepareStatement(sql)) {
			try(ResultSet registros = comando.executeQuery()) {
				CategoriaDao categoriadao = new CategoriaDao(conexao);
				while (registros.next()) {
					Categoria categoria = categoriadao.buscaPorId(registros.getInt("categoria_id"));
					Produto produto = new Produto(registros.getString("nome"),registros.getInt("preco_unitario"),registros.getInt("quantidade_estoque"),categoria);
					produto.setId(registros.getInt("id"));
					produtos.add(produto);
				} 
			}
		}
		return produtos;
	}
	
	public void exclui(int id) throws SQLException {
		String sql = "delete from comex.produto where id = ?";
		try(PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setInt(1, id);
			comando.execute();
		}
	}
	
	public void altera(int id,String nome,double preco, int qtdEstoque) throws SQLException {

		String sql = "update comex.produto" 
							+ " SET nome = ?,"
							+ 	"preco_unitario = ?,"
							+	"quantidade_estoque = ?"
							+"where id = ?";
		try(PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setString(1, nome);
			comando.setDouble(2, preco);
			comando.setInt(3, qtdEstoque);
			comando.setInt(4, id);
			comando.execute();
		}
	}
	
	
}
