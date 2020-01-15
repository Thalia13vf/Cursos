package basico.solid.liskov.problema;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo retangulo = new Quadrado();
		retangulo.setAltura(10);
		retangulo.setLargura(5);
		System.out.println("Área: " + retangulo.getArea());
		
	}

}
