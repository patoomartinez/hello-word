package com.udemy.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2ControllerGET {
	// peticiones GET
	private static final String EXAMPLE_2 = "example2";

	// localhost:8080/example2/request1?nm=JON
	// localhost:8080/example2/request1?nm=MIKEL
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name = "nm", required = false, defaultValue = "null") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_2);
		mav.addObject("nm_in_model", name);
		return mav;
	}

	// peticion get metodo 2

	// localhost:8080/example2/request2/jon
	// localhost:8080/example2/request2/mikel
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_2);
		mav.addObject("nm_in_model", name); 
		return mav;
	}
}
