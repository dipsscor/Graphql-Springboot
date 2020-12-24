package com.dipsscor.config.repository;

import org.springframework.data.repository.CrudRepository;

import com.dipsscor.config.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
