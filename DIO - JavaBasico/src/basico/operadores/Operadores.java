package basico.operadores;

public class Operadores {
	public static void main(String[] args) {
		final var numero = 4;
		
		if(numero > 20)
			System.out.println("O n�mero � maior que 20");
		else if(numero >= 10)
			System.out.println("O numero � maior ou igual a 10");
		else if(numero <=5)
			System.out.println("O n�mero � menor ou igual a 5");
		else
			System.out.println("Nenhuma das anteriores");
		
	}
}
