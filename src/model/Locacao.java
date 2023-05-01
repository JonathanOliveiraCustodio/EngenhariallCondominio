package model;

public class Locacao implements IMorador,ILocacao,IApartamento {
	
	 private int numeroLocacao;

	    
	    public Locacao (String nome,int celular,String situacao,int cpf, int numeroLocacao){
	        this.numeroLocacao = numeroLocacao;       
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


	@Override
	public int getNumeroLocacao() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setNumeroLocacao(int numeroLocacao) {
		// TODO Auto-generated method stub
		
	}

}
