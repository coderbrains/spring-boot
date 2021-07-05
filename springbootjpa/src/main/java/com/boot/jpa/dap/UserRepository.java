package com.boot.jpa.dap;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.jpa.entities.Userr;


@Configuration
public interface UserRepository  extends CrudRepository<Userr, Integer> {

	public List<Userr> findByName(String name);

	public List<Userr> getAllUserr();
	
}
