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
		
		if (cliente.getNome().length() <= 5) {
			throw new IllegalArgumentException("Nome deve ser maior que 5");
		}
		boolean valido = cliente.getCpf().matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d");
		if (valido == false) {
			throw new IllegalArgumentException("Preencha o cpf nesse formato: 000.000.000-00");
		} 
		if (cliente.getTelefone() != null) {
			boolean Tvalido = cliente.getTelefone().matches("\\d\\d \\d \\d\\d\\d\\d-\\d\\d\\d\\d");
			if (Tvalido == false) {
				throw new IllegalArgumentException("Preencha o telefone nesse formato: 00 0 0000-0000");
			}
		}
		if(Character.isDigit(cliente.getNome().charAt(0))) {
			throw new IllegalArgumentException("Primeiro Digito do nome nao pode ser um numero");
		}
		if(cliente.getRua().length() <= 5) {
			throw new ComexException("Rua deve ser maior que 5");
		}
		if(cliente.getNumero().length() <= 1) {
			throw new ComexException("Numero deve ser maior que 1 caracter");
		}
		if(cliente.getBairro().length() <= 1 ) {
			throw new ComexException("Bairro deve ser maior que 1 caracter");
		}
		if (cliente.getCidade().length() <= 1) {
			throw new ComexException("Cidade deve ser maior que 1 caracter");
		}
		
		System.out.println("Adicionando Cliente !");
		this.daoCliente.insere(cliente);
		System.out.println("Inseriu");
	}
	
	
	
	
}
