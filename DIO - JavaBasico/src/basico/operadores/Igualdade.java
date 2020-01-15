package basico.operadores;

public class Igualdade {
	public static void main(String[] args) {
		final int numero = 11;
		
		if(numero == 10) 
			System.out.println("O número é 10");
		else 
		{
			System.out.println("O número não é 10");
		}
			
		if(numero != 10) 
		{
			System.out.println("O número não é 10");
		}
		else {
			System.out.println("O número é 10");
		}
		
		final var letra = "B";
		
		if("A".equals(letra))
			System.out.println("É a letra A");
		
		if(!letra.equals("A")) //Negação com Equals
			System.out.println("Não é a letra A");
		
		
	}
}
