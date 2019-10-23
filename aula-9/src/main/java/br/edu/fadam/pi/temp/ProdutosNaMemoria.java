package br.edu.fadam.pi.temp;

import java.util.ArrayList;
import java.util.List;

import br.edu.fadam.pi.model.Produto;

public class ProdutosNaMemoria {
	
	private static List<Produto> produtos = new ArrayList<>();
	
	
	public static void add(Produto produto) {
		produtos.add(produto);
	}
	
	public static List<Produto> lista() {
		return produtos;
	}

}
