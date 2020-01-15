package basico.heranca;

public class Motocicleta extends Veiculo{

	private String cilindradas;

	public Motocicleta(String modelo, String marca, double valorVenal, String cilindradas) {
		super(modelo, marca, valorVenal);
		this.cilindradas = cilindradas;
	}
	
	public double calculaImposto() 
	{
		return this.getValorVenal() * 0.03;
	}
	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
}
