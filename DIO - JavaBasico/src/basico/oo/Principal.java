package basico.oo;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ana");
		Pessoa p1 = new Pessoa("José");
		Pessoa p2 = new Pessoa("Paulo");
		Pessoa p3 = new Pessoa("Paula");
		Carro c = new Carro();
		c.adicionaPessoa(p);
		c.adicionaPessoa(p1);
		c.adicionaPessoa(p2);
		c.adicionaPessoa(p3);
		
		
		c.removePessoa(2);
		System.out.println("-----------------------");
		c.mostrar();
	}
}
