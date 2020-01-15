package basico.operadores;

public class Logicos {
	public static void main(String[] args) {
		final var numero = 2;
		final var letra = "A";
		
		//Sort Circuit
		if(numero < 5 && letra.equals("A")) //duas verdadeiras
			System.out.println("Atendeu a condi��o");
		if(numero < 5 || letra.equals("A"))// 1 das condi��es
			System.out.println("Atendeu a outra condi��o");
		if((10 - 5) > 1 && (5 - 3) > 1) //opera��es matem�ticas
			System.out.println("L�gica maluca");
		
		//Non Sort Circuit	
		if(verifica(8) && verifica("A")) 
		{
			System.out.println("OK");
		}
		else 
		{
			System.out.println("N�o OK");
		}
	}

	private static boolean verifica(String letra) 
	{
		System.out.println("Verificando letra...");
		return letra.equals("A");
	}
	private static boolean verifica(Integer numero) 
	{
		System.out.println("Verificando n�mero...");
		return numero > 10;
	}
}	