package com.ms.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
	}
}
