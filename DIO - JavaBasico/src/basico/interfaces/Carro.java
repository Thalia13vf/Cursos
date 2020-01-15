package basico.interfaces;

public interface Carro extends Automovel{
	String marca(); //public
	Double valor();
	default void ligar() 
	{
		System.out.println("Ligando o carro");
	}
	default String codigo() 
	{
		return "ddkdus23";
	}
}
