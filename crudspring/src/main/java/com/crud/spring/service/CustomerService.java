package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.entitiy.Customer;
import com.crud.spring.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo ;
	
	public List<Customer> getAll(){
		List<Customer> findAll = customerRepo.findAll();
		return findAll;
	}
	
}
