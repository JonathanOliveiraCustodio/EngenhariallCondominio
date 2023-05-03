package model;

import java.sql.Date;

public interface IDespesas {
    
    public double getvalor();
	public void setvalor(double valor);
	
	public Date getDataVencimento();
	public void setDataVencimento(Date dataVencimento);
	
	public int getNumeroDespesa();
	public void setNumeroDespesa(int numeroDespesa);
}
