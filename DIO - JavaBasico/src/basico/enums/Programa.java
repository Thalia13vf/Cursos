package basico.enums;

public class Programa {
	public static void main(String[] args) {
		System.out.println(TipoVeiculo.TERRESTRE);
		System.out.println(TipoVeiculo.AQUATICO);
		//Da String pega o enum com o mesmo nome
		System.out.println(TipoVeiculo.valueOf("AEREO"));
		
		//System.out.println(TipoVeiculo.valueOf("AERo")); 
		//erro ao utilizar uma constante que n�o existe no enum
		//var d = 11;
		//System.out.println(d);
		
		for(TipoVeiculo tipo : TipoVeiculo.values()) 
			//pega todos os tipos que tem no enum
			//ou seja, todas as constantes
		{
			System.out.println("Tipo " + tipo);
		}
		
		System.out.println("C�digo do Status CLOSE: " + Status.CLOSE.getCod());
		System.out.println("Texto do Status CLOSE: " + Status.CLOSE.getTexto());
		System.out.println("C�digo do Status OPEN: " + Status.OPEN.getCod());
		System.out.println("Texto do Status OPEN: " + Status.OPEN.getTexto());
	}
}
