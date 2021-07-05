package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.entitiy.Customer;
import com.crud.spring.service.CustomerService;

@RestController
public class TestController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/home")
	public List<Customer> name() {
		List<Customer> all = customerService.getAll();
		return all;
	}
	
	public Customer customer() {
		
	}
	
}
