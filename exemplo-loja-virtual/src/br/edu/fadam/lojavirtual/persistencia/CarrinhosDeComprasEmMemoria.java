package br.edu.fadam.lojavirtual.persistencia;
import java.util.HashMap;
import java.util.Map;

import br.edu.fadam.lojavirtual.modelo.CarrinhoDeCompra;

public class CarrinhosDeComprasEmMemoria {
	
	public static Map<Long, CarrinhoDeCompra> carrinhosDeCompras = new HashMap<Long, CarrinhoDeCompra>();
	
}
