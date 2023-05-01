package view;

import model.Despesas;
import model.Pagamentos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 // 1º Operação Polimorfica
		 Despesas   d1 = new Despesas(null, 0, null, 0, 0, null);
		 d1.getValor();
		 
		 //2° Operação Polimorfica
		 
		 Pagamentos  p2 = new Pagamentos(null, 0, null, 0, 0, null, null);
		 p2.setDataPagamento(null);
		 
		 

	}

}
