package basico.oo.exercicio;

public class Atendente extends Funcionario{
	public Atendente(String nome, String cpf, double salario) 
	{
		super(nome, cpf);
		this.setSalario(salario);
	}
	public double calculaSalario() 
	{
		return this.getSalario() * 0.01;
	}
}
