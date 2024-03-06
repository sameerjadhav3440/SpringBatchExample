package com.batch.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
public class SpringBootbatchexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootbatchexampleApplication.class, args);
	}

}
