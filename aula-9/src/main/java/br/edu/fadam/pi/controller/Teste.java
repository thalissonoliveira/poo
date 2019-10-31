package br.edu.fadam.pi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Teste {
	
	@RequestMapping(value = "/contato", method = RequestMethod.GET)
	public String home(ModelMap model) {
		model.addAttribute("teste", "OKAY");
		return "teste";
	}
	
}
