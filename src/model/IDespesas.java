package model;

import java.sql.Date;

public interface IDespesas {
    
    public double getvalor();
	public void getvalor(double valor);
	
	public int getDataVencimento();
	public void setDataVencimento(Date dataVencimento);


}
