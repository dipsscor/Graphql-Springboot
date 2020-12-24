package com.dipsscor.config.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dipsscor.config.model.Author;
import com.dipsscor.config.model.Book;
import com.dipsscor.config.repository.AuthorRepository;
import com.dipsscor.config.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
