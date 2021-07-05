package com.crud.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.entitiy.Customer;

public interface CustomerRepo extends JpaRepository<Customer	, Integer>{

	
			
}
