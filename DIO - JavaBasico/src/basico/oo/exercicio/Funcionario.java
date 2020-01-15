package basico.oo.exercicio;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, String cpf) 
	{
		this.nome = nome;
		this.cpf = cpf;
	}
	public double calculaSalario() 
	{
		return this.salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
