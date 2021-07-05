package com.firstrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstrest.entity.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Integer>{

	
	
	
}
