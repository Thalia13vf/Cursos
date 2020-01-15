package basico.oo.exercicio;

public class Principal {
	public static void main(String[] args) {
		Gerente g = new Gerente("Ana", "56777888", 10000);
		Supervisor s = new Supervisor("Paulo", "4454564", 5000);
		Atendente a = new Atendente("Jose", "4453453", 2000);
		
		System.out.println("Gerente: " + g.calculaSalario());
		System.out.println("Supervisor: " + s.calculaSalario());
		System.out.println("Atendente: " + a.calculaSalario());
	}
}
