package basico.oo.exercicio;

public class Supervisor extends Funcionario{
	public Supervisor(String nome,String cpf, double salario) 
	{
		super(nome, cpf);
		this.setSalario(salario);
	}
	public double calculaSalario() 
	{
		return this.getSalario() * 0.05;
	}
}
