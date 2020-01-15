package basico.operadores;

public class Logicos {
	public static void main(String[] args) {
		final var numero = 2;
		final var letra = "A";
		
		//Sort Circuit
		if(numero < 5 && letra.equals("A")) //duas verdadeiras
			System.out.println("Atendeu a condição");
		if(numero < 5 || letra.equals("A"))// 1 das condições
			System.out.println("Atendeu a outra condição");
		if((10 - 5) > 1 && (5 - 3) > 1) //operações matemáticas
			System.out.println("Lógica maluca");
		
		//Non Sort Circuit	
		if(verifica(8) && verifica("A")) 
		{
			System.out.println("OK");
		}
		else 
		{
			System.out.println("Não OK");
		}
	}

	private static boolean verifica(String letra) 
	{
		System.out.println("Verificando letra...");
		return letra.equals("A");
	}
	private static boolean verifica(Integer numero) 
	{
		System.out.println("Verificando número...");
		return numero > 10;
	}
}	