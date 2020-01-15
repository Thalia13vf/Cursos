package basico.encapsulamento;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Thalia", 13, 03, 1998);
		System.out.println(p1.calculaIdade());
		System.out.println(p1.getDataNascimento());
	}
	
	
}
