package br.edu.fadam.pi.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.edu.fadam.pi.config.SystemConfig;
import br.edu.fadam.pi.model.Produto;
import br.edu.fadam.pi.temp.ProdutosNaMemoria;

@Controller
public class ProdutoController {

	@RequestMapping(value = "/cadastroproduto", method = RequestMethod.POST)
	public String submit(@RequestParam("produto") String produto, @RequestParam("preco") String preco,
			@RequestParam("file") MultipartFile file, ModelMap modelMap) throws IOException {
		
		Produto prod = new Produto();
		prod.setNome(produto);
		prod.setPreco(Double.valueOf(preco));
		prod.setFilePath(file.getOriginalFilename());
		
		String imagePath = SystemConfig.STATIC_FOLDER + File.separator + "produto" + File.separator + file.getOriginalFilename();
		File imagem = new File(imagePath);
		
		FileUtils.copyInputStreamToFile(file.getInputStream(), imagem);
		ProdutosNaMemoria.add(prod);
		modelMap.addAttribute("list", ProdutosNaMemoria.lista());
		return "redirect:produto";
		
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public String lista(ModelMap model) {
		model.addAttribute("list", ProdutosNaMemoria.lista());
		return "produto";
	}
	
}
