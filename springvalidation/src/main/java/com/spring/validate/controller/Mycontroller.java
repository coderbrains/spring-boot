package com.spring.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	public String pro(@Valid  @ModelAttribute("LoginData") LoginCredentials loginCredentials, BindingResult result ,Model model) {
		
		System.out.println(loginCredentials);
		
		if(result.hasErrors()) {
			return "home";
		}
		
		model.addAttribute("login", loginCredentials);
		
		
		return "process";
	}
	
	
	
	
	
	
}
