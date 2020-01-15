package basico.oo;

public class Carro 
{
	private int quantidadePessoas = 0;
	private Pessoa[] pessoas = new Pessoa[4];
	
	
	public void adicionaPessoa(Pessoa pessoa) 
	{
		this.pessoas[this.quantidadePessoas] = pessoa;
		this.quantidadePessoas++;
	}
	
	public void removePessoa(int i) 
	{
		for(int c=0; c < pessoas.length; c++) 
		{
			if(c == i) 
			{
				this.pessoas[i].setNome("Vazio"); 
			}	
		}
	}
	
	public void mostrar() 
	{
		for(int i =0; i < this.pessoas.length; i++) 
		{
			System.out.println("Lugar: " + i + " " + "Nome: " + this.pessoas[i].getNome());
	
		}
	}
	
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	
	
}
