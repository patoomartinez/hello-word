package com.udemy.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.udemy.backend.model.Person;
import java.util.List;

import java.util.*;

@Controller 
@RequestMapping("/example")
public class ExampleController {

	public static final String EXMAPLE_VIEW = "example";

	// primer forma
	@RequestMapping("/exampleString")
	// @RequestMapping(value = "/exampleString", method = RequestMethod.GET)
	public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		return EXMAPLE_VIEW;
	}

	// segunda forma
	@RequestMapping("/exampleModelAndView")
	public ModelAndView exampleModelAndView() {

		ModelAndView mov = new ModelAndView(EXMAPLE_VIEW);
		mov.addObject("people", getPeople());
		return mov;
	}

	private List<Person> getPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Patricio", 30));
		people.add(new Person("Micaela", 24));
		people.add(new Person("Juana", 29));
		people.add(new Person("Jose", 41));
		people.add(new Person("Miguel", 19));

		return people;

	}

}

/**
 * // primer forma @RequestMapping("/exampleString") // @RequestMapping(value =
 * "/exampleString", method = RequestMethod.GET) public String exampleString() {
 * return EXMAPLE_VIEW; }
 * 
 * // segunda forma @RequestMapping("/exampleModelAndView") public ModelAndView
 * exampleModelAndView() { return new ModelAndView(EXMAPLE_VIEW); }
 * 
 * 
 * // otras // primer forma @RequestMapping("/exampleString")
 * // @RequestMapping(value = "/exampleString", method = RequestMethod.GET)
 * public String exampleString(Model model) { model.addAttribute("person", new
 * Person("patricio", 23)); return EXMAPLE_VIEW; }
 * 
 * // segunda forma @RequestMapping("/exampleModelAndView") public ModelAndView
 * exampleModelAndView() {
 * 
 * ModelAndView mov = new ModelAndView(EXMAPLE_VIEW); mov.addObject("person",
 * new Person("juana", 30)); return mov; }
 */
