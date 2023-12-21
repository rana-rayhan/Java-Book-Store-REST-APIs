package com.bookapi.bookrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookRestApiApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(BookRestApiApplication.class, args);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
