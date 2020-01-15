package basico.abstracts;

public abstract class FormaGeometrica {
	public abstract String nome();
	public abstract Double area();
	
	public String desenha(int x, int y) 
	{
		return "Desenhando as coordenadas x= " + x + " y= " + y;
	}
}
