package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemojenkinApplication {
	@GetMapping("/msg")
	public String getMessage() {
		return "welcome to jenkins cicd ";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemojenkinApplication.class, args);
	}

}
