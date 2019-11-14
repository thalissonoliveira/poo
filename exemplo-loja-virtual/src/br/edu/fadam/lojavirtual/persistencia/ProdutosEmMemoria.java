package br.edu.fadam.lojavirtual.persistencia;
import java.util.HashMap;
import java.util.Map;

import br.edu.fadam.lojavirtual.modelo.Produto;

public class ProdutosEmMemoria {
	
	public static Map<Long, Produto> produtos = new HashMap<Long, Produto>();
	
}
