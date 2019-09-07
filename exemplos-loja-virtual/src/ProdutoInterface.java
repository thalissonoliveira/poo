
public interface ProdutoInterface {
	
	Long getCodigoDeBarras();
	
	void setCodigoDeBarras(Long codigoDeBarras);
	
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
