package model;

import java.sql.Date;

public class Pagamentos extends Despesas implements ICondominio,IApartamento {
	
	private Date dataPagamento;

	public Pagamentos(String mes, int ano, String tipo, double valor, double total, Date dataVencimento, Date dataPagamento) {
		super(mes, ano, tipo, valor, total, dataVencimento);
		
		this.dataPagamento = dataPagamento;
        //this.ano = ano;
		// TODO Auto-generated constructor stub
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
	

}
