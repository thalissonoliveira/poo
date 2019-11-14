package br.edu.fadam.lojavirtual.modelo;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	private Long id;

	private List<ItemCarrinho> itens;

	private String codigo;

	private double valorTotal;

	public CarrinhoDeCompra() {
		itens = new ArrayList<ItemCarrinho>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void addItem(Produto produto, int qtd) {
		ItemCarrinho itemCarrinho = new ItemCarrinho();
		itemCarrinho.setProduto(produto);
		itemCarrinho.setQuantidade(qtd);
		this.itens.add(itemCarrinho);
	}

	public void removerItem(Long idItem) {
		for (ItemCarrinho itemCarrinho : itens) {
			if (itemCarrinho.getId().equals(idItem)) {
				this.itens.remove(itemCarrinho);
			}
		}
	}

	public void imprimirDadosCarrinho() {
		System.out.println("Carrinho de Id " + id + " e código " + codigo);
		for (ItemCarrinho itemCarrinho : itens) {
			System.out.println(itemCarrinho);
		}
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void calculaValorTotal() {
		double valor = 0;
		for (ItemCarrinho itemCarrinho : itens) {
			valor = valor + (itemCarrinho.getProduto().getValor() * itemCarrinho.getQuantidade());
		}
		this.valorTotal = valor;
	}

}
