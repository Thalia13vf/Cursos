package basico.lacos;

public class While {
	public static void main(String[] args) {
		var x = 0;
		
		//Testa a condi��o antes
		while(x < 1) 
		{
			System.out.println("Dentro do while");
			x++;
		}
		
		var y = 0;
		
		//Testa depois a condi��o
		do 
		{
			System.out.println("Dentro do DoWhile");
		}while(y++ < 1);
	}
}
