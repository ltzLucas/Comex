package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.CategoriaDao;
import br.com.comex.modelo.Categoria;


@WebService
public class ComexWS {
	
	Connection conexao = new ConnectionFactory().getConnection();
	private CategoriaDao dao = new CategoriaDao(conexao);
	
	public List<Categoria> getCategorias() throws SQLException{
		
		System.out.println("Chamando getCategorias! ");
		List<Categoria> lista = dao.listarTodas();
		return lista;
	}
	
}
