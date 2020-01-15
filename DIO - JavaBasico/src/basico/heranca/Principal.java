package basico.heranca;

public class Principal {
	public static void main(String[] args) {
		//Veiculo generico = new Veiculo();
		//generico.setValorVenal(1000);
		//System.out.println(generico.calculaImposto());
		
		Carro carro = new Carro("","",1000, 4);
		//carro.acelera();
		System.out.println(carro.calculaImposto());
	
		Motocicleta moto = new Motocicleta("","",1000,"");
		//moto.acelera();
		//moto.setValorVenal(1000);
		System.out.println(moto.calculaImposto());
	}
}
