/**
 * Classe que representa um usuário da Loja Virtual.
 * 
 * @author Thalisson
 *
 */
public class Usuario implements UsuarioInterface {
	
	private Long id;
	
	private String nome;
	
	private String email;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean efetuarLogin(String email, String senha) {
		return false;
	}
	
}
