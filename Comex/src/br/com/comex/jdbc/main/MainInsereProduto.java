package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.StatusCategoria;

public class MainInsereProduto {

	public static void main(String[] args) throws SQLException {

		
		List<Produto> produtos = new ArrayList<Produto>();

		Categoria categoria = new Categoria("Informaticas", StatusCategoria.ATIVA);
		produtos.add(new Produto("Computador-Gamer",1000,3,categoria));
		
		Connection conexao = new ConnectionFactory().getConnection();
		
		String sql = "INSERT INTO comex.produto (nome,preco_unitario,quantidade_estoque,categoria_id)"
				+"VALUES"
				+"(?,?,?,?)";
		try (PreparedStatement comando = conexao.prepareStatement(sql)) {
			for (Produto produto : produtos) {
				
				comando.setString(1,produto.getNome());
				comando.setDouble(2,produto.getPrecoUnitario());
				comando.setInt(3, produto.getQuantidadeEstoque());
				comando.setInt(4, produto.getCategoria().getId());
				
				comando.execute();
				
				System.out.println("Categoria Adicionada com Sucesso: \n\t"+produto);
			}
		}
		conexao.close();
	}

}
