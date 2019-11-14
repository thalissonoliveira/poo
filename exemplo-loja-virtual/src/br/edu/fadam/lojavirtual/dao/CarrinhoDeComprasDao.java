package br.edu.fadam.lojavirtual.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.edu.fadam.lojavirtual.modelo.CarrinhoDeCompra;
import br.edu.fadam.lojavirtual.persistencia.CarrinhosDeComprasEmMemoria;

public class CarrinhoDeComprasDao {
	
	public void inserir(CarrinhoDeCompra carrinhoDeCompra) {
		System.out.println("Inserindo o carrinho " + carrinhoDeCompra.getCodigo());
		CarrinhosDeComprasEmMemoria.carrinhosDeCompras.put(carrinhoDeCompra.getId(), carrinhoDeCompra);
	}
	
	public void alterar(CarrinhoDeCompra carrinhoDeCompra) {
		System.out.println("Alterando o carrinho " + carrinhoDeCompra.getCodigo());
		CarrinhosDeComprasEmMemoria.carrinhosDeCompras.remove(carrinhoDeCompra.getId());
		CarrinhosDeComprasEmMemoria.carrinhosDeCompras.put(carrinhoDeCompra.getId(), carrinhoDeCompra);
	}
	
	public void deletar(CarrinhoDeCompra carrinhoDeCompra) {
		CarrinhosDeComprasEmMemoria.carrinhosDeCompras.remove(carrinhoDeCompra.getId());
		System.out.println("Inserindo o carrinho " + carrinhoDeCompra.getCodigo());
	}
	
	public List<CarrinhoDeCompra> listar() {
		List<CarrinhoDeCompra> carrinhoDeCompras = new ArrayList<CarrinhoDeCompra>();
		System.out.println("Carrinhos:");
		for (CarrinhoDeCompra carrinhoDeCompra : CarrinhosDeComprasEmMemoria.carrinhosDeCompras.values()) {
			carrinhoDeCompras.add(carrinhoDeCompra);
			carrinhoDeCompra.imprimirDadosCarrinho();
//			System.out.println(carrinhoDeCompra.getCodigo());
			System.out.println("##############");
		}
		return carrinhoDeCompras;
	}
	
	public CarrinhoDeCompra buscarPorNome(String nome) {
		Collection<CarrinhoDeCompra> carrinhoDeCompras = CarrinhosDeComprasEmMemoria.carrinhosDeCompras.values();
		for (CarrinhoDeCompra carrinhoDeCompra : carrinhoDeCompras) {
			if (nome.contentEquals(carrinhoDeCompra.getCodigo())) {
				return carrinhoDeCompra;
			}
		}
		return null;
	}

	public CarrinhoDeCompra buscarPorId(long id) {
		return CarrinhosDeComprasEmMemoria.carrinhosDeCompras.get(id);
	}
	
}
