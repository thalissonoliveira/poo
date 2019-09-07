
public interface UsuarioInterface {
	
	Long getId();
	
	void setId(Long id);
	
	String getNome();
	
	void setNome(String nome);
	
	String getEmail();
	
	void setEmail(String email);
	
	String getSenha();
	
	void setSenha(String senha);
	
	boolean efetuarLogin(String email, String senha);
	

}
