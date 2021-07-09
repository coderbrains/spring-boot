package com.crud.embeded.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.embeded.entity.Book;
import com.crud.embeded.response.ResponseModel;
import com.crud.embeded.service.BookService;

@RestController
public class TestController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/test")
	public String test() {
		return "this is the testing of the api:";
	}
	
	@PostMapping("/submit")
	public ResponseModel submit(@RequestBody Book book) {
		return new ResponseModel(0, "table not created");
		Book saveBook = bookService.saveBook(book);
		if(saveBook == null) {
			return new ResponseModel(0, "Book not saved. try again.");
		}else {
			return new ResponseModel(1, "book saved successfully.");
		}
		
	}
	
	@GetMapping("/getbooks")
	public List<Book> getbooks(){
		return bookService.getList();
	}
	
}
