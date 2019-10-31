package br.edu.fadam.lojavirtual;

import br.edu.fadam.lojavirtual.dao.UsuarioDao;
import br.edu.fadam.lojavirtual.modelo.Usuario;

public class Main {
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("Qualquer");
		usuario.setId(10l);
		usuario.setSenha("senha");
		
		new UsuarioDao().inserir(usuario);
		
		Usuario usuarioBuscado = new UsuarioDao().buscarPorNome("Qualquer");
		System.out.println("Usuário buscado: " + usuarioBuscado.getNome());
		new UsuarioDao().listar();
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Qualquer2");
		usuario2.setId(102l);
		usuario2.setSenha("senha2");
		usuario2.getNome();
	}

}
