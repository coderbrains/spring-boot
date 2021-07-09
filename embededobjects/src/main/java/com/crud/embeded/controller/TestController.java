package com.crud.embeded.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.embeded.entity.Book;
import com.crud.embeded.service.BookService;

@RestController
public class TestController {

	@Autowired
	private BookService bookService;

	@GetMapping("/test")
	public String test() {
		return "this is the testing of the api:";
	}
	
	@GetMapping("/getBooks")
	public ResponseEntity<Object> getbooks(){
		return ResponseEntity.of(Optional.of(bookService.getBookList()));
	}
	
	
	@GetMapping("/getauthor")
	public ResponseEntity<Object> getauthor(){
		return ResponseEntity.of(Optional.of(bookService.getAuthorList()));
	}
	
	
	@PostMapping("savebook")
	public ResponseEntity<Object>   saveBook(@RequestBody Book book){
		
		return ResponseEntity.of(Optional.of(bookService.saveBook(book)));
		
	}
	
	
	@PostMapping("/getbookbyid")
	public ResponseEntity<Object> getBookById(@RequestBody int id){
		return ResponseEntity.of(Optional.of(bookService.getBookbyid(id)));
	}
	
	
	
	

	
}
