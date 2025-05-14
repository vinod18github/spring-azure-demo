package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringAzureDemo1Application {

	@GetMapping("/message")
	public String message() {
		return "congrats ! your app deployed in azure successfully";
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemo1Application.class, args);
	}

}
