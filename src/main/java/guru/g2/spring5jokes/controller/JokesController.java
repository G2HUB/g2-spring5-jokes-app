package guru.g2.spring5jokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.g2.spring5jokes.services.JokesService;

@Controller
public class JokesController {
	
	final private JokesService jokeService;
	
	public JokesController(JokesService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping({"/",""})
	public String getJoke(Model model) {		
		model.addAttribute("joke",jokeService.getJoke());
		return "joke";
	}
}
