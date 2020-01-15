package basico.lacos;

public class While {
	public static void main(String[] args) {
		var x = 0;
		
		//Testa a condição antes
		while(x < 1) 
		{
			System.out.println("Dentro do while");
			x++;
		}
		
		var y = 0;
		
		//Testa depois a condição
		do 
		{
			System.out.println("Dentro do DoWhile");
		}while(y++ < 1);
	}
}
