package br.com.comex.main;

import java.util.Comparator;

import br.com.comex.csv.PedidoCsv;

public class ComparetorMaisBaratoCaro implements Comparator<Double> {

	@Override
	public int compare(Double o1, Double o2) {
		
		if(o1 > o2) {
			return 1; 
		}else if(o1 < o2) {
			return -1;
		}else {
			return 0;
		}
	}
}
