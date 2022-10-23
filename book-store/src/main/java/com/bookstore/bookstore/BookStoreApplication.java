package com.bookstore.bookstore;

import com.bookstore.bookstore.model.Book;
import com.bookstore.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder()
				.name("xx")
				.author("xx")
				.price(11.0)
				.stock(10)
				.build();
		Book book2 = Book.builder()
				.name("yy")
				.author("yy")
				.price(12.0)
				.stock(10)
				.build();

		Book book3 = Book.builder()
				.name("zz")
				.author("zz")
				.price(13.0)
				.stock(10)
				.build();

		bookRepository.saveAll(Arrays.asList(book3,book2,book1));
	}
}
