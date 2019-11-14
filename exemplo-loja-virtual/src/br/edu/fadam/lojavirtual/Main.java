package br.edu.fadam.lojavirtual;

import br.edu.fadam.lojavirtual.dao.CarrinhoDeComprasDao;
import br.edu.fadam.lojavirtual.modelo.CarrinhoDeCompra;
import br.edu.fadam.lojavirtual.modelo.Produto;

public class Main {

	public static void main(String[] args) {
//		Usuario usuario = new Usuario();
//		usuario.setNome("Qualquer");
//		usuario.setId(10l);
//		usuario.setSenha("senha");
//		
//		new UsuarioDao().inserir(usuario);
//		
//		Usuario usuarioBuscado = new UsuarioDao().buscarPorNome("Qualquer");
//		System.out.println("Usuário buscado: " + usuarioBuscado.getNome());
//		new UsuarioDao().listar();
//		
//		Usuario usuario2 = new Usuario();
//		usuario2.setNome("Qualquer2");
//		usuario2.setId(102l);
//		usuario2.setSenha("senha2");
//		usuario2.getNome();

		Produto celularHighEnd = new Produto();
		celularHighEnd.setNome("Iphone 11");

		Produto celularDeEntrada = new Produto();
		celularDeEntrada.setNome("Moto G5 Play");

		Produto monitorUltraWide29pol = new Produto();
		monitorUltraWide29pol.setNome("LG Ultra Wide 29''");

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		carrinhoDeCompra.setId(10l);
		carrinhoDeCompra.setCodigo("NADKAJDAF100");
		carrinhoDeCompra.addItem(celularHighEnd, 2);
		carrinhoDeCompra.addItem(celularDeEntrada, 3);

		CarrinhoDeCompra carrinho2 = new CarrinhoDeCompra();
		carrinho2.setId(20l);
		carrinho2.setCodigo("NADKAJDAF200");
		carrinho2.addItem(celularDeEntrada, 10);
//		carrinho2.addItem(monitorUltraWide29pol, 20);

		CarrinhoDeComprasDao ccd = new CarrinhoDeComprasDao();
		ccd.inserir(carrinhoDeCompra);
		ccd.inserir(carrinho2);
		
		CarrinhoDeCompra carrinhoBuscadoNaMemoria20 = ccd.buscarPorId(10l);
		carrinhoBuscadoNaMemoria20.imprimirDadosCarrinho();

	}

}
