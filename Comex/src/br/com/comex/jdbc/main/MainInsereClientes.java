package br.com.comex.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Endereco;
import br.com.comex.modelo.EstadoDoCliente;

public class MainInsereClientes {

	public static void main(String[] args) throws SQLException {

		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Endereco endereco = new Endereco("Rua 123","1008","Casa1","Salgadinho","Campo Largo",EstadoDoCliente.PR);
		clientes.add(new Cliente("Lucas Eduardo Lima", "109.129.039-38","41 9 1010-1010", endereco));
		
		try(Connection conexao = new ConnectionFactory().getConnection()){
			String sql = "INSERT INTO comex.cliente (nome,cpf,telefone,rua,numero,complemento,bairro,cidade,uf)"
					+"VALUES"
					+"(?,?,?,?,?,?,?,?,?)";
			try (PreparedStatement comando = conexao.prepareStatement(sql)) {
				for (Cliente cliente : clientes) {
					
					comando.setString(1,cliente.getNome());
					comando.setString(2,cliente.getCpf()); 
					comando.setString(3,cliente.getTelefone());
					comando.setString(4,cliente.getEndereco().getRua());
					comando.setString(5,cliente.getEndereco().getNumero());
					comando.setString(6,cliente.getEndereco().getComplemento());
					comando.setString(7,cliente.getEndereco().getBairro());
					comando.setString(8,cliente.getEndereco().getCidade());
					comando.setString(9,cliente.getEndereco().getEstado().name());
					comando.execute();
					System.out.println("Cliente Adicionado com Sucesso");
				}
			}
		}
	}
}
