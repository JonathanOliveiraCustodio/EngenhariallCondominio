package model;

import java.sql.Date;

public interface ICondominio{

	
	public String getMes();
	public void setMes(String mes);
	
	public int getAno();
	public void setAno(int ano);
	
	public String getTipo();
	public void setTipo(String tipo);
	
	public double getValor();
	public void setValor(double valor);
	
	public double getTotal();
	public void setTotal(double total);
	
	public Date getDataVencimento();
	public void SetDataVencimento(Date total);
	
}