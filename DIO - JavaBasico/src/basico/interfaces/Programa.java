package basico.interfaces;

public class Programa {

		public static void main(String[] args) {
			Carro gol = new Gol();
			System.out.println("Marca do Gol: "+gol.marca());
			gol.ligar();
			
			final Trator trator = new Trator();
			System.out.println("Registro do trator: "+ trator.registro());
			trator.ligar();
			
			final Fiesta fiesta = new Fiesta();
			System.out.println("Marca do fiesta: "+ fiesta.marca());
			System.out.println("Registro do fiesta: "+fiesta.registro());
			fiesta.ligar();
			//Carro.super.ligar(); só pode ser acessado por quem implementa
		}
	}


