package basico.exceptions;

public class Principal {
	public static void main(String[] args) {
		try 
		{
			int i = 9/1;
		}
		catch(Exception ex) 
		{
			throw new ArithmeticException(ex.getMessage());
		}
		finally
		{
			System.out.println("ioidjjdjdjdjdj");
		}
		
	}
}
