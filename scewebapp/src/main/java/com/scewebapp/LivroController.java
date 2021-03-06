package com.scewebapp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.scewebapp.models.Livro;
import com.scewebapp.repository.LivroRepository;

@Controller //identifica esta classe como controller
public class LivroController {
	@Autowired
	private LivroRepository er;
	@RequestMapping(value="/cadastrarLivro", method=RequestMethod.GET)
	public String form() {
		return "livro/formLivro";
	}
	@RequestMapping(value="/cadastrarLivro", method=RequestMethod.POST)
	public String form(@Valid Livro livro, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarLivro";
		}
		er.save(livro);
		attributes.addFlashAttribute("mensagem", "Livro cadastrado com sucesso!");
		return "redirect:/cadastrarLivro";
	}
	@RequestMapping(value="/livros")
	public ModelAndView listaLivros() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Livro> livros = er.findAll();
		mv.addObject("livros", livros);
		return mv;
	}
}
