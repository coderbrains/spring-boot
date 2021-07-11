package com.spring.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.validate.entity.LoginData;

@Controller
public class MyController {

	@GetMapping("/home")
	public String help(Model model) {
		model.addAttribute("Logindata", new LoginData());
		return "home";
	}
	
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("Logindata") LoginData loginData , BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			return "home";
		}
		
		model.addAttribute("Logindata", loginData);
		return "process";
	}
	
}
