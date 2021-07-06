package com.crud.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {

	@RequestMapping("/home")
	@ResponseBody
	public String gome() {
		
		return "home page has been fired by awanish";
		
		
	}
	
}
