package view;

import model.Despesas;
import model.Locacao;
import model.Pagamentos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 // 1º Operação Polimorfica
		 Despesas   d1 = new Despesas(null, 0, null, 0, 0, null);
		 d1.getValor();
		 
		 //2° Operação Polimorfica
		 
		 Pagamentos  p2 = new Pagamentos(null, 0, null, 0, 0, null, null, 0);
		 p2.setDataPagamento(null);
		 
		//3° Operação Polimorfica
		 Locacao  l1 = new Locacao(null, 0, null, 0, 0);
		 l1.setNumeroLocacao(2); 
		 l1.setnome("João");
		 l1.setcpf(0);
		 l1.setNumeroApartamento(10);
		 
		//4° Operação Polimorfica
		 Pagamentos  p1 = new Pagamentos(null, 0, null, 0, 0, null, null, 0);
		 
		 p1.getnumeroPagamento();
		 p1.getnumeroPagamento();
		 p1.getNumeroApartamento();
		 

	}

}
