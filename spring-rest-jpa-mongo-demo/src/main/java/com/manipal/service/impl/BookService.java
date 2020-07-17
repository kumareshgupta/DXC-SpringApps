package com.manipal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Book;
import com.manipal.repository.BookRepository;
import com.manipal.service.IBookService;

@Service
public class BookService implements IBookService {
	@Autowired
	private BookRepository bookRepository;
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(Integer id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public Book findByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	@Override
	public void saveOrUpdateBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
		
	}
	
	
	
}
