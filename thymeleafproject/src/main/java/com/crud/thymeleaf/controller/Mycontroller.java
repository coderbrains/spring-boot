package com.crud.thymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		model.addAttribute("name", "Awanish kumar singh");
		model.addAttribute("date", new Date());
		
		return "home";
	}
	
}
