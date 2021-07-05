package com.crud.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crud.spring.entitiy.Customer;
import com.crud.spring.repo.CustomerRepo;

@SpringBootApplication
public class CrudspringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudspringApplication.class, args);

		CustomerRepo bean = context.getBean(CustomerRepo.class);

		Customer customer = new Customer();
		
		customer.setCity("name");
		customer.setName("awanish");
		
		Customer save = bean.save(customer);
		System.out.println(save);
	}

}
