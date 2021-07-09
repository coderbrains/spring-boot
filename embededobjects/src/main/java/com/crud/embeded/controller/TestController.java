package com.crud.embeded.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.embeded.entity.Book;
import com.crud.embeded.response.ResponseModel;

@RestController
public class TestController {

	
	
	@GetMapping("/test")
	public String test() {
		return "this is the testing of the api:";
	}
	
	@PostMapping("/submit")
	public ResponseModel submit(@PathVariable Book book) {
		
		
		
	}
	
}
