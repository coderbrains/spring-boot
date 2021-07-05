package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("getCustomer/{id}")
	public Customer customer(@PathVariable String id) {
		
		int id1 = Integer.parseInt(id);
		
		Customer customerById = customerService.getCustomerById(id1);
		return customerById;
		
	}
	
	@PostMapping("/putuser")
	public Customer putCustomer(@RequestBody  Customer customer) {
		Customer putCustomer = customerService.putCustomer(customer);
		return putCustomer;
	}
}
