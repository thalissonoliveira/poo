package br.edu.fadam.lojavirtual.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.edu.fadam.lojavirtual.modelo.Produto;
import br.edu.fadam.lojavirtual.persistencia.ProdutosEmMemoria;

public class ProdutoDao {
	
	public void inserir(Produto produto) {
		System.out.println("Inserindo o produto " + produto.getNome());
		ProdutosEmMemoria.produtos.put(produto.getId(), produto);
	}
	
	public void alterar(Produto produto) {
		System.out.println("Alterando o produto " + produto.getNome());
		ProdutosEmMemoria.produtos.remove(produto.getId());
		ProdutosEmMemoria.produtos.put(produto.getId(), produto);
	}
	
	public void deletar(Produto produto) {
		ProdutosEmMemoria.produtos.remove(produto.getId());
		System.out.println("Inserindo o produto " + produto.getNome());
	}
	
	public List<Produto> listar() {
		List<Produto> produtos = new ArrayList<Produto>();
		System.out.println("Produtos:");
		for (Produto produto : ProdutosEmMemoria.produtos.values()) {
			produtos.add(produto);
			System.out.println(produto.getNome());
		}
		return produtos;
	}
	
	public Produto buscarPorNome(String nome) {
		Collection<Produto> produtos = ProdutosEmMemoria.produtos.values();
		for (Produto produto : produtos) {
			if (nome.contentEquals(produto.getNome())) {
				return produto;
			}
		}
		return null;
	}
	
}
