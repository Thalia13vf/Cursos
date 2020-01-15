package basico.str;

public class Strings2 {
	public static void main(String[] args) {
		String t = "Aula de Java na DigitalInovation One";
		String[] teste = t.split(" ");
		System.out.println("A B C D E F G".toCharArray());
		
		System.out.println("Aula".concat(" de Java"));
		System.out.println("1234agdg".replaceAll("[0-9]", "#"));
		for(String e : teste) 
		{
			System.out.println(e);
		}
		
	}
}
