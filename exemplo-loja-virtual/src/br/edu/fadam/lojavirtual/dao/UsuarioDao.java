package br.edu.fadam.lojavirtual.dao;
import java.util.ArrayList;
import java.util.List;

import br.edu.fadam.lojavirtual.modelo.Usuario;
import br.edu.fadam.lojavirtual.persistencia.UsuariosEmMemoria;

public class UsuarioDao {
	
	public void inserir(Usuario usuario) {
		System.out.println("Inserindo o usuário " + usuario.getNome());
		UsuariosEmMemoria.usuarios.put(usuario.getNome(), usuario);
	}
	
	public void alterar(Usuario usuario) {
		System.out.println("Alterando o usuário " + usuario.getNome());
		UsuariosEmMemoria.usuarios.get(usuario.getNome());
	}
	
	public void deletar(Usuario usuario) {
		UsuariosEmMemoria.usuarios.remove(usuario.getNome());
		System.out.println("Inserindo o usuário " + usuario.getNome());
	}
	
	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		System.out.println("Usuários:");
		for (Usuario usuario : UsuariosEmMemoria.usuarios.values()) {
			usuarios.add(usuario);
			System.out.println(usuario.getNome());
		}
		return usuarios;
	}
	
	public Usuario buscarPorNome(String nome) {
		return UsuariosEmMemoria.usuarios.get(nome);
	}
	
}
