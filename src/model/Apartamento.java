package model;

public class Apartamento implements IApartamento{
	
	
    private int numeroApartamento;
    private int quantidadeQuartos;
 

    
    public Apartamento (int numeroApartamento,int quantidadeQuartos){
      
        this.numeroApartamento = numeroApartamento;
        this.quantidadeQuartos = quantidadeQuartos;
       
    }

	@Override
	public int getNumeroApartamento() {
		// TODO Auto-generated method stub
		return numeroApartamento;
	}

	@Override
	public void setNumeroApartamento(int numeroApartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getQuantidadeQuartos() {
		// TODO Auto-generated method stub
		return quantidadeQuartos;
	}

	@Override
	public void setQuantidadeQuartos(int quantodadeQuartos) {
		// TODO Auto-generated method stub
		
	}
	

}
