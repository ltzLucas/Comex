package br.com.comex.jdbc.dao.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.CategoriaDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainTestaInsercaoCategoriaDao { 
 
	public static void main(String[] args) throws SQLException {
		Categoria categoria = new Categoria("Esportivo",StatusCategoria.ATIVA);
		Connection conexao = new ConnectionFactory().getConnection();
		
		List<Categoria> categorias = new ArrayList<>();
		
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
		//categoriaDao.insere(categoria);
		//categoriaDao.exclui(28);
		categoriaDao.altera(21,"INFORMATICA");
		categorias = categoriaDao.listarTodas();
		
		System.out.println(categorias);
	}
}
