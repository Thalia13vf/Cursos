package basico.tipos;

public class Unboxing {
	public static void main(String[] args) {
		
		//int i2 = new Integer(3); depreciado na versão 9
		int i = Integer.valueOf(22);
		
		Boolean b = new Boolean(false);
		Boolean b2 = Boolean.TRUE;
		//Boolean b3 = Boolean.getBoolean(s:"false"); nas versões mais novas
		Boolean b4 = Boolean.getBoolean("false");
		
		Number numero = Integer.valueOf(123);
		System.out.println(numero.toString());
	}
}
