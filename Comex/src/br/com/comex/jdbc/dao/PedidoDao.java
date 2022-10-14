package br.com.comex.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class PedidoDao {
	private Connection conexao;
	
	public PedidoDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	 public void Insere(Pedido pedido) throws SQLException {
		 String sql = "insert into comex.pedido (data,cliente_id) Values (?,?)";
		 String[] colunaParaRetornar = { "id" };
		 try (PreparedStatement ps = conexao.prepareStatement(sql,colunaParaRetornar)) {
			 ps.setString(1, pedido.getData());
			 ps.setInt(2, pedido.getCliente().getId());
			 ps.execute();
			 ResultSet rs = ps.getGeneratedKeys();
			 rs.next();
			 pedido.setId(rs.getInt(1));
		 }
	 }
	 
	 public List<Pedido> listarTodos() throws SQLException {
			String sql = "select * from comex.pedido";
			
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				List<Pedido> pedidos = new ArrayList<>();
				try(ResultSet registros = comando.executeQuery()) {
					ClientesDao clientedao = new ClientesDao(conexao);
					while (registros.next()) {
						Cliente cliente = clientedao.buscaPorId(registros.getInt("cliente_id"));
						Pedido pedido = new Pedido(registros.getString("data"),cliente);
						pedido.setId(registros.getInt("id"));
						pedidos.add(pedido);
					}
				} 
				return pedidos;
			}
		}
	 
	 
	 public void exclui(int id) throws SQLException {
			String sql = "delete from comex.pedido where id = ?";
			try(PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.setInt(1, id);
				comando.execute();
			}
		}
	 
	 public void alteraData(String data,int id) throws SQLException {
		 String sql = "update comex.pedido set data = ? where id = ?";
			try(PreparedStatement comando = conexao.prepareStatement(sql)) {
				comando.setString(1, data);
				comando.setInt(2, id);
				comando.execute();
			}
	 }
	 
	 
	 
	 
	 
	 
}
