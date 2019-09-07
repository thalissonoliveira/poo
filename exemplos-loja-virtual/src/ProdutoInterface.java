
public interface ProdutoInterface {
	
	Long getId();
	
	void setId(Long id);
	
	Long getCodigoDeBarras();
	
	void setCodigoDeBarras(Long codigoDeBarras);
	
	String getNome();
	
	void setNome(String nome);
	
	double getPreco();
	
	void setPreco(double preco);
	
	int getQuantidadeEmEstoque();
	
	/**
	 * Método que atualiza a quantidade de produtos no estoque. Se o valor informado for positivo, aumenta a quantidade. 
	 * Caso seja nativo, diminui da quantidade em estoque.
	 * 
	 * @return sucesso na operação.
	 */
	boolean atualizarQuantidadeNoEstoque(Long codigoDeBarras, int quantidade);

}
