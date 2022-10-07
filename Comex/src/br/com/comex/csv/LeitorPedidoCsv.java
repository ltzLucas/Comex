package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidoCsv {
	
	public List<PedidoCsv> lerPedidoCsv() throws FileNotFoundException{
		List<PedidoCsv> PedidosCsv = new ArrayList<PedidoCsv>();
		
		InputStream inputStream = new FileInputStream("pedidos.csv");
		Scanner scanner = new Scanner(inputStream,"UTF-8");
		
		scanner.nextLine();
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			
			String categoria = linhaScanner.next();
			String produto = linhaScanner.next();
			String preco = linhaScanner.next();
			String quantidade = linhaScanner.next();
			String data = linhaScanner.next();
			String cliente = linhaScanner.next();
			
			PedidoCsv pedido = new PedidoCsv(categoria, produto, cliente, preco, quantidade, data);
			PedidosCsv.add(pedido);
			linhaScanner.close();
		}
		scanner.close();
		return PedidosCsv;
	}
}
