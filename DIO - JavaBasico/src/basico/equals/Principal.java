package basico.equals;

public class Principal {
	public static void main(String[] args) {
		Carro c1 = new Carro("Palio", "Fiat", 2000, 4);
		Carro c2 = new Carro("Palio", "Fiat", 2000, 4);
		
		System.out.println(c1.equals(c2));
	}
}
