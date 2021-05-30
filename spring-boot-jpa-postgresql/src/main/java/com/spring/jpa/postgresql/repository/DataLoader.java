package com.spring.jpa.postgresql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa.postgresql.model.Book;

@Component
public class DataLoader implements ApplicationRunner {

	private BookRepository userRepository;

	@Autowired
	public DataLoader(BookRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void run(ApplicationArguments args) {
		userRepository.save(new Book("Da Vinci Code","Brown, Dan", "Crime, Thriller & Adventure", true));
		userRepository.save(new Book("Twilight","Meyer, Stephenie", "Fiction", true));
	}
}