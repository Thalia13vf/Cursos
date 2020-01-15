package basico.tipos;

public class DefaultValues {
	public static void main(String[] args) 
	{
		final Default d = new Default();
		System.out.println(d.getI()); //aparecerá o valor default 0
		System.out.println(d.isActive()); //aparecerá o valor default false
	}
	
}

class Default
{	
	int i;
	boolean active;
	public int getI() 
	{
		return i;
	}
	public boolean isActive() 
	{
		return active;
	}
}
