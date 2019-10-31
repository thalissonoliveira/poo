package br.edu.fadam.lojavirtual.modelo;

/**
 * Classe de Modelo. Essa é a classe que representa o conceito principal a ser
 * incluído no CRUD (criar, editar, deletar e listar).
 * 
 * 
 * @author Thalisson
 *
 */
public class Usuario {

	private Long id;
	
	private String nome;
	
	private String senha;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.nome = "Qualquer";
	}
	
}
