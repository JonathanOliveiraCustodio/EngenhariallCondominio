package model;

import java.sql.Date;


public class Despesas extends Condominio{
	
	private Date dataVencimento;
    private double valor;

	public Despesas(String mes, int ano, String tipo, double valor, double total, Date dataVencimento) {
		super(mes, ano, tipo, valor, total, dataVencimento);
		// TODO Auto-generated constructor stub
		
		this.dataVencimento=dataVencimento;
		this.valor=valor;
	}
	
	// 1 ° Operação Polimorfica

    @Override
    public Date getDataVencimento () {
        return super.getDataVencimento();
    }
    
    public double getValor () {
        return super.getValor();
    }
    

}
