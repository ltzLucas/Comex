package br.com.comex.jdbc.dao.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.CategoriaDao;
import br.com.comex.jdbc.dao.ProdutoDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class MainTestaProdutoDao {

	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().getConnection();
		Categoria categoria = new CategoriaDao(conexao).buscaPorId(30);
		
		Produto produto = new Produto("Computador Gamer","Acer",1,5,categoria);
		ProdutoDao produtodao = new ProdutoDao(conexao);
		
		//produtodao.insere(produto);
		//produtodao.exclui(14);
		//produtodao.altera(33, "Impressora 3D","filip", 1500, 3);
		System.out.println(produtodao.listaTudo());
	}
}
