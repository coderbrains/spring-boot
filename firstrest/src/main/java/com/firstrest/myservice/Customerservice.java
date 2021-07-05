package com.firstrest.myservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstrest.entity.Customer;
import com.firstrest.repo.Customerrepo;

@Service
public class Customerservice {

	@Autowired
	private Customerrepo customerrepo;
	
	public Customer saveCustomer(Customer customer) {	
		Customer save = customerrepo.save(customer);
		return save;
	}
	
	public List<Customer> getAll(){
		
		List<Customer> findAll = customerrepo.findAll();
		return findAll;
	}
	
}
