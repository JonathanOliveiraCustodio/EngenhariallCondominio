package model;

import java.sql.Date;

public class Condominio implements ICondominio {
	
	  private String mes;
	  private int ano;
	  private String tipo;
	  private double valor;
	  private double total;
	  private Date dataVencimento;
  		    
	    public Condominio (String mes,int ano,String tipo, double valor, double total, Date dataVencimento){	      
	        this.mes = mes;
	        this.ano = ano;
	        this.tipo=tipo;
	        this.valor=valor;
	        this.total=total;
	        this.dataVencimento=dataVencimento;
	       
	    }

	@Override
	public String getMes() {
		// TODO Auto-generated method stub
		return mes;
	}

	@Override
	public void setMes(String mes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return ano;
	}

	@Override
	public void setAno(int ano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public void setValor(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void setTotal(double total) {
		// TODO Auto-generated method stub

	}

	@Override
	public Date getDataVencimento() {
		// TODO Auto-generated method stub
		return dataVencimento;
	}

	@Override
	public void SetDataVencimento(Date total) {
		// TODO Auto-generated method stub
		
	}

}
