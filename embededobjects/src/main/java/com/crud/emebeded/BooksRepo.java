package com.crud.emebeded;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.emebeded.entity.Book;

@Repository
public interface BooksRepo extends JpaRepository<Book	, Integer>{

	
}
