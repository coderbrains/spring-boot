package com.crud.emebeded.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.emebeded.BooksRepo;
import com.crud.emebeded.entity.Book;



@Service
public class MyService {

	@Autowired
	private BooksRepo booksRepo;
	
	public Book saveB(Book book) {
		
		Book save = null;
		save = booksRepo.save(book);
		return save;
	}
	
	public List<Book> getAll(){
		List<Book> findAll = booksRepo.findAll();
		return findAll;
	}
	
	
	public Book getByid(int id) {
		Optional<Book> findById = booksRepo.findById(id);
		Book book = findById.get();
		return book;
	}


}
