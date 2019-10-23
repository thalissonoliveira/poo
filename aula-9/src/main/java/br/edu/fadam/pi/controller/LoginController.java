package br.edu.fadam.pi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.fadam.pi.model.Usuario;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = "/logon", method = RequestMethod.POST)
	public String doLogin(@RequestParam("email") String email, @RequestParam("senha") String password, HttpSession session) {
		System.out.println("Login");
		System.out.println("Usuario: " + email);
		System.out.println("Senha: " + password);
		
		Usuario usuario = new Usuario();
		usuario.setNome("Guest");
		usuario.setEmail("guest@guest.com");
		session.setAttribute("usuarioLoja", usuario);
		return "index";
	}
	
	@RequestMapping(value = "/logout")
	public String doLogout(HttpSession session) {
		System.out.println("Logout");
		session.invalidate();
		return "index";
	}	
	
	
}
