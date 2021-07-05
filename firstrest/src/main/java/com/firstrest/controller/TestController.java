package com.firstrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstrest.entity.Customer;
import com.firstrest.myservice.Customerservice;

@RestController
public class TestController {

	@Autowired
	private Customerservice customerservice;
	
	@GetMapping("/home")
	public String home() {
		return "rest api is created successfully.";
	}
	
	@PostMapping("/createCustomer")
	public Customer saveCust(@RequestBody Customer  customer) {
		Customer saveCustomer = customerservice.saveCustomer(customer);
		return saveCustomer;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAll(){

		List<Customer> all = customerservice.getAll();
		
		return all;
	}
	
}
