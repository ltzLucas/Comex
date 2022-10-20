package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.dao.CategoriaDao;
import br.com.comex.jdbc.dao.ClientesDao;
import br.com.comex.jdbc.dao.ProdutoDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.Produto;


@WebService
public class ComexWS {
	
	private Connection conexao = new ConnectionFactory().getConnection();
	private CategoriaDao daoCategoria = new CategoriaDao(conexao);
	private ClientesDao daoCliente = new ClientesDao(conexao); 
	private ProdutoDao daoProduto = new ProdutoDao(conexao);
	
	@WebMethod(operationName = "listarCategorias")
	public List<Categoria> getCategorias() throws SQLException{
		
		System.out.println("Chamando getCategorias !");
		List<Categoria> lista = daoCategoria.listarTodas();
		return lista;
	}
	
	public void adicionarCategoria(String nome) throws SQLException{
		if(nome == null ) {
			throw new IllegalArgumentException("Nome nao pode ser nulo");
		}
		System.out.println("Adicionando Categoria !");
		this.daoCategoria.inserePeloNome(nome);
		System.out.println("Inseriu");
	}
	
	@WebMethod(operationName = "ListarClientes")
	public List<Cliente> getClientes() throws SQLException{
		
		System.out.println("Chamando getClientes !");
		List<Cliente> listaC = daoCliente.listarTodos();
		return listaC;
	}
	
	public List<Produto> listaProdutos() throws SQLException{
		
		System.out.println("Chamando ListaProdutos");
		List<Produto> listaP = daoProduto.listaTudo();
		return listaP;
	}
	
	public void adicionarCliente(Cliente cliente) throws SQLException {
		
		System.out.println("Adicionando Cliente !");
		this.daoCliente.insere(cliente);
		System.out.println("Inseriu");
	}
	
	
	
	
}
