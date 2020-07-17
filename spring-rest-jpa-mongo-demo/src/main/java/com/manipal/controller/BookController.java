package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Book;
import com.manipal.service.impl.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.findAll();
	}
	
	@GetMapping(value="/{title}")
	public Book getByTitle(@PathVariable String title ) {
		return bookService.findByTitle(title);
	}
	
	@PostMapping
	public ResponseEntity<?> saveBook(@RequestBody Book book){
		bookService.saveOrUpdateBook(book);
		return new ResponseEntity("Book added successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
	
	
	
	
	
	
	
}
