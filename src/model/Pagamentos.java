package model;

import java.sql.Date;

public class Pagamentos extends Despesas implements ICondominio,IApartamento,IMorador {
	
	private Date dataPagamento;
	private int numeroPagamento;

	public Pagamentos(String mes, int ano, String tipo, double valor, double total, Date dataVencimento, Date dataPagamento, int numeroPagamento) {
		super(mes, ano, tipo, valor, total, dataVencimento);
		
		this.dataPagamento = dataPagamento;
        this.numeroPagamento = numeroPagamento;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getnumeroPagamento() {
		// TODO Auto-generated method stub
		return numeroPagamento;
	}

	
	public void setnumeroPagamento(int numeroApartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumeroApartamento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNumeroApartamento(int numeroApartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getQuantidadeQuartos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setQuantidadeQuartos(int quantodadeQuartos) {
		// TODO Auto-generated method stub
		
	}
    
	// 2 ° Operação Polimorfica
	
	public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;

    }



	@Override
	public String getnome() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setnome(String nome) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int getcelular() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void setcelular(int celular) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int getcpf() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void setcpf(int cpf) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String getsituacao() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setsituacao(String sitacao) {
		// TODO Auto-generated method stub
		
	}
	

}
