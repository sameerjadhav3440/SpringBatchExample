package com.batch.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootbatchexampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootbatchexampleApplication.class, args);

		System.exit(SpringApplication.exit(SpringApplication.run(SpringBootbatchexampleApplication.class, args)));

	}

}
