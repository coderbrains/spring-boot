package com.crud.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crud.spring.entitiy.Customer;
import com.crud.spring.repo.CustomerRepo;

@SpringBootApplication
public class CrudspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudspringApplication.class, args);
	}
}
