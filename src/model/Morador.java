package model;

public class Morador implements IMorador {
	
	private String nome;
    private int celular;
    private int cpf;
    private String situacao;

    
    public Morador (String nome,int celular,String situacao,int cpf){
        this.nome = nome;
        this.celular = celular;
        this.situacao = situacao;
        this.cpf = cpf;
    }


	@Override
	public String getnome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public void setnome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getcelular() {
		// TODO Auto-generated method stub
		return celular;
	}


	@Override
	public void setcelular(int celular) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getcpf() {
		// TODO Auto-generated method stub
		return cpf;
	}


	@Override
	public void setcpf(int cpf) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getsituacao() {
		// TODO Auto-generated method stub
		return situacao;
	}


	@Override
	public void setsituacao(String sitacao) {
		// TODO Auto-generated method stub
		
	}
}
