package basico.str;

public class BuilderDeString {
	public static void main(String[] args) {
		var nome = "Thalia";
		final var builder = new StringBuilder(nome);
		System.out.println(builder.append("Vilela"));
		//append adiciona uma String a String builder	
		
		final var reverse = builder.reverse();
		System.out.println(reverse);
	    //reverse faz a string builder ao contario e armazena na String reverse
		
		final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
		System.out.println(insert);
		//o insert consegue inserir caracteres em posiçãoes especificas 
		//Na String reversa, o length retorna o total de posições e depois adiciona 
		//o caractere na última posição
	}
}
