/**
 * Classe que representa um produto. 
 * 
 * 
 * @author Thalisson
 *
 */
public class Produto implements ProdutoInterface {
	
	private Long codigoDeBarras;
	
	private double preco;
	
	private int quantidadeEmEstoque = 0;

	//Getters and Setters
	public Long getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(Long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	@Override
	public boolean atualizarQuantidadeNoEstoque(Long codigoDeBarras, int quantidade) {
		/*
		 * Aqui ser� implementada a l�gica de incremento ou decremento da quantidade em estoque. O booleano 
		 * indica se houve sucesso ou n�o na opera��o. Se, por exemplo, o usu�rio informar -20 e quantidade atual
		 * for 10, o resultado final ser� -10. O resultado final pode ser no m�nimo zero. 
		 * */
		return true;
	}

}
