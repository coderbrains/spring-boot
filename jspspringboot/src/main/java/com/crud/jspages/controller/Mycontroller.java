package com.crud.jspages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/contact")

	public String contact() {
		return "contact";
	}
	
}
