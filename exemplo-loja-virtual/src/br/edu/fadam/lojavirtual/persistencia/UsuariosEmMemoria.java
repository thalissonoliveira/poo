package br.edu.fadam.lojavirtual.persistencia;
import java.util.HashMap;
import java.util.Map;

import br.edu.fadam.lojavirtual.modelo.Usuario;

public class UsuariosEmMemoria {
	
	public static Map<Long, Usuario> usuarios = new HashMap<Long, Usuario>();
	
}
