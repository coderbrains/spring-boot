package com.spring.validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.entity.LoginCredentials;

@Controller
public class Mycontroller {

	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("LoginData", new LoginCredentials());
		return "home";
	}
	
	@PostMapping("/process")
	public String pro() {
		
		System.out.println( "hello");
		
		return "process";
	}
	
	
	
	
}
