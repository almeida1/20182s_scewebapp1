package com.scewebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scewebapp.models.Livro;
import com.scewebapp.repository.LivroRepository;

@Controller
public class LivroController {
	@Autowired
	private LivroRepository er;
	@RequestMapping(value="/cadastrarLivro", method=RequestMethod.GET)
	public String form() {
		return "livro/formLivro";
	}
	@RequestMapping(value="/cadastrarLivro", method=RequestMethod.POST)
	public String form(Livro livro) {
		er.save(livro);
		return "redirect:/cadastrarLivro";
	}
	@RequestMapping("/livros")
	public ModelAndView listaLivros() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Livro> livros = er.findAll();
		mv.addObject("livros", livros);
		return mv;
	}
}
