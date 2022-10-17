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
import br.com.comex.modelo.StatusCategoria;

public class ClientesDao {
	private Connection conexao;

	public ClientesDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void insere(Cliente cliente) throws SQLException {
		
		String sql = "INSERT INTO comex.cliente (nome,cpf,telefone,rua,numero,complemento,bairro,cidade,uf)"
				+"VALUES"
				+"(?,?,?,?,?,?,?,?,?)"; 
		String[] colunaParaRetornar = { "id" };
		try (PreparedStatement comando = conexao.prepareStatement(sql,colunaParaRetornar)) {
				comando.setString(1,cliente.getNome());
				comando.setString(2,cliente.getCpf()); 
				comando.setString(3,cliente.getTelefone());
				comando.setString(4,cliente.getRua());
				comando.setString(5,cliente.getNumero());
				comando.setString(6,cliente.getComplemento());
				comando.setString(7,cliente.getBairro());
				comando.setString(8,cliente.getCidade());
				comando.setString(9,cliente.getEstado().name());
				comando.execute();
				
				ResultSet rs = comando.getGeneratedKeys();
				rs.next();
				
				cliente.setId(rs.getInt(1));
		}
	}
	  
	public List<Cliente> listarTodos() throws SQLException {
		String sql = "select * from comex.cliente";
		
		try (PreparedStatement comando = conexao.prepareStatement(sql)) {
			List<Cliente> clientes = new ArrayList<>();
			try(ResultSet registros = comando.executeQuery()) {
				while (registros.next()) {
					Cliente cliente = new Cliente(registros.getString("nome"),registros.getString("cpf"),registros.getString("telefone")
							,registros.getString("rua"),registros.getString("numero")
							,registros.getString("complemento"),registros.getString("bairro")
							,registros.getString("cidade"),EstadoDoCliente.valueOf(registros.getString("uf")));
					cliente.setId(registros.getInt("id"));
					clientes.add(cliente);
					
				}
			} 
			return clientes;
		}
	}
	
	public Cliente buscaPorId(int id) throws SQLException {
		String sql = "select * from comex.cliente where id = ?";
		try (PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setInt(1, id);
			try(ResultSet registros = comando.executeQuery()) {
				if (registros.next()) {
					Cliente cliente = new Cliente(registros.getString("nome"),registros.getString("cpf"),registros.getString("telefone")
							,registros.getString("rua"),registros.getString("numero")
							,registros.getString("complemento"),registros.getString("bairro")
							,registros.getString("cidade"),EstadoDoCliente.valueOf(registros.getString("uf")));
					cliente.setId(registros.getInt("id"));
					return cliente;
					
				}
				return null;
			} 
		}
	}
	 
	public void exclui(int id) throws SQLException {
		String sql = "delete from comex.cliente where id = ?";
		try(PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setInt(1, id);
			comando.execute();
		}
	}
	
	public void alteraNome(int id,String nome) throws SQLException {

		String sql = "update comex.cliente set nome = ? where id = ?";
		try(PreparedStatement comando = conexao.prepareStatement(sql)) {
			comando.setString(1, nome);
			comando.setInt(2, id);
			comando.execute();
		}
	}
	
}
