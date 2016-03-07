package com.martinetherton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Bean
	Person person() {
		return new Person();
	}
}
