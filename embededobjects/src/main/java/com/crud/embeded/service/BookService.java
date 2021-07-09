package com.crud.embeded.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud.embeded.entity.Author;
import com.crud.embeded.entity.Book;
import com.crud.embeded.repo.AuthorRepo;
import com.crud.embeded.repo.BookRepo;

@Service
public class BookService {

	
	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private AuthorRepo authorRepo;
	
	public Book saveBook(Book book)
	{
		return bookRepo.save(book);
	}
	
	
	public List<Book> getBookList(){
		return bookRepo.findAll();
	}
	
	public List<Author> getAuthorList(){
		return authorRepo.findAll();
	}


	public Object getBookbyid(int id) {
		return bookRepo.findById(id);
	}
}
