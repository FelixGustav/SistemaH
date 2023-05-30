package Sistema;

public class Paciente {
	private String nome;
	private double cpf;
	private int Nprioridade;
	
//	Construtor
	public Paciente(String nome,double cpf,double Nprioridade) {
		this.nome = nome;
		this.cpf = cpf;	
	}
	

//	getters
	public void setnome(String nome){
		this.nome = nome;
	}
	public void setcpf(double cpf) {
		this.cpf = cpf;
	}
	public void setNprioridade(int Nprioridade) {
		this.Nprioridade = Nprioridade;
	}
	
	
//	setters
	public String getnome(){
		return nome;
	}
	
	public Double getcpf() {
		return cpf;
	}
	
	public int getNprioridade() {
		return Nprioridade;
	}
	
 	
	/*@Override
	public String toString(){
		return nome+ "\n"+ cpf ;
	}*/

}
