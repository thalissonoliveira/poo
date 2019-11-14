package br.edu.fadam.lojavirtual.modelo;

public class ItemCarrinho {
	
	private Long id;
	
	private Produto produto;
	
	private int quantidade;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Item[Produto: " + produto.getNome() + " - " + quantidade + " unidades";
	}
	
}
