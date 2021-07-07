package com.crud.emebeded.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.emebeded.entity.Book;
import com.crud.emebeded.service.MyService;

@RestController
public class MyController {

	
	@Autowired
	private MyService myService;
	
	@GetMapping("/test")
	public String name() {
		
		 return "testing the api working";
	}
	
	@PostMapping("/savenewbook")
	public Book saveBook(@PathVariable Book book) {
		
		Book saveB =  myService.saveB(book);
		return saveB;
		
	}
}
