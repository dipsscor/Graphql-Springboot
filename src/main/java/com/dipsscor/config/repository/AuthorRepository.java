package com.dipsscor.config.repository;

import org.springframework.data.repository.CrudRepository;

import com.dipsscor.config.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
