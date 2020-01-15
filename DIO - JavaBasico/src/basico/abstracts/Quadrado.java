package basico.abstracts;

public class Quadrado extends FormaGeometrica{
	private String nome;
	private Double area;
	
	
	
	public Quadrado(String nome, Double area) {
		super();
		this.nome = nome;
		this.area = area;
	}

	@Override
	public String nome() {
		return nome;
	}

	@Override
	public Double area() {
		return area;
	}
}
