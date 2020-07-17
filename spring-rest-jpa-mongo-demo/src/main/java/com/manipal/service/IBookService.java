package com.manipal.service;

import java.util.List;

import com.manipal.model.Book;

public interface IBookService {
	List<Book> findAll();
	Book findById(Integer id);
	Book findByTitle(String title);
	void saveOrUpdateBook(Book book);
	void deleteBook(Integer id);	
}
