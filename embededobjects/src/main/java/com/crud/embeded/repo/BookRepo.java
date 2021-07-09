package com.crud.embeded.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.embeded.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	
	
}
