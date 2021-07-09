package com.crud.embeded.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.embeded.entity.Book;
import com.crud.embeded.repo.BookRepo;

@Service
public class BookService {

	
	@Autowired
	private BookRepo bookRepo;

	public Book saveBook(Book book)
	{
		Book book1 = null;
		
		try {
			
			book1 =  bookRepo.save(book);
			return book1;
			
		}catch(Exception e){
			e.printStackTrace();
			return  book1;
		}
		
	}
	
	
	public List<Book> getList(){
		return bookRepo.findAll();
	}
}
