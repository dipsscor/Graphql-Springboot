package com.dipsscor.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dipsscor.config.exception.GraphQLErrorAdapter;
import com.dipsscor.config.model.Author;
import com.dipsscor.config.model.Book;
import com.dipsscor.config.repository.AuthorRepository;
import com.dipsscor.config.repository.BookRepository;
import com.dipsscor.config.resolver.BookResolver;
import com.dipsscor.config.resolver.Mutation;
import com.dipsscor.config.resolver.Query;

import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.*;


@SpringBootApplication
public class GraphqlSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringbootApplication.class, args);
	}
	
	


	@Bean
	public BookResolver authorResolver(AuthorRepository authorRepository) {
		return new BookResolver(authorRepository);
	}

	@Bean
	public Query query(AuthorRepository authorRepository, BookRepository bookRepository) {
		return new Query(authorRepository, bookRepository);
	}

	@Bean
	public Mutation mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
		return new Mutation(authorRepository, bookRepository);
	}

	@Bean
	public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
		return (args) -> {
			Author author = new Author("Herbert", "Schildt");
			authorRepository.save(author);

			bookRepository.save(new Book("Java: A Beginner's Guide, Sixth Edition", "0071809252", 728, author));
		};
	}

}
