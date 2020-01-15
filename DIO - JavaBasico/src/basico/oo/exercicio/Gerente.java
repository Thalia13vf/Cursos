package basico.oo.exercicio;

public class Gerente extends Funcionario{
	public Gerente(String nome, String cpf, double salario) 
	{
		super(nome, cpf);
		this.setSalario(salario);
	}
	public double calculaSalario() 
	{
		return this.getSalario() * 0.1;
	}
	
}
