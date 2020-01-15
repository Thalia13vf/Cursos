package basico.interfaces;

public class Fiesta implements Carro,Veiculo{
	@Override
	public String registro() {
		return "FTF2452442";
	}

	@Override
	public String marca() {
		return "Ford";
	}

	@Override
	public void ligar() {
		Carro.super.ligar();
		Veiculo.super.ligar();
	}

	@Override
	public Double valor() {
		// TODO Auto-generated method stub
		return null;
	}
}
