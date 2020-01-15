package basico.solid.dependecy.solucao;

public class ProdutoRepository {
	private DbConnection dbConnection;
	
	public ProdutoRepository(DbConnection dbConnection) 
	{
		this.dbConnection = dbConnection;
	}
	public void salvarProdutos() 
	{
		//salva lista de produtos
	}
}
