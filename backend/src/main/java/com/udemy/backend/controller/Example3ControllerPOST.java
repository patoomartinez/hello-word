package com.udemy.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.backend.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3ControllerPOST {

	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";

	@GetMapping("/showform")
	public String showForm(Model model) {
		model.addAttribute("person", new Person());
		return FORM_VIEW;

	}

	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person person) {
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("person", person);
		return mav;
	}

	// redireccionamos (para vovler)
	// forma1
	
//	@GetMapping("/")
//	public String redirect() {
//		return "redirect:/example3/showform";
//	}

	// forma2
	@GetMapping("/")
	public RedirectView redirectView() {
		return new RedirectView("/example3/showform");
	}

}
