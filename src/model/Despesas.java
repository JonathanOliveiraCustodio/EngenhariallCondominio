package model;

import java.sql.Date;


public class Despesas implements ICondominio,IDespesas{
	
	private Date dataVencimento;
    private double valor;
    private int numeroDespesa;

	public Despesas(String mes, int ano, String tipo, double valor, double total, Date dataVencimento) {
		super();
		// TODO Auto-generated constructor stub
		
		this.dataVencimento=dataVencimento;
		this.valor=valor;
	}

	@Override
	public double getvalor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setvalor(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDataVencimento(Date dataVencimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumeroDespesa() {
		// TODO Auto-generated method stub
		return numeroDespesa;
	}

	@Override
	public void setNumeroDespesa(int numeroDespesa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMes(String mes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAno(int ano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setValor(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTotal(double total) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getDataVencimento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetDataVencimento(Date total) {
		// TODO Auto-generated method stub
		
	}
	
	// 1 ° Operação Polimorfica

  
    

}
