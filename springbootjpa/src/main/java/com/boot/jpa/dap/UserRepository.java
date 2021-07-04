package com.boot.jpa.dap;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import com.boot.jpa.entities.Userr;


@Configuration
public interface UserRepository  extends CrudRepository<Userr, Integer> {

	
	
	
}
