package com.manipal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manipal.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
	Book findByTitle(String title);
}
