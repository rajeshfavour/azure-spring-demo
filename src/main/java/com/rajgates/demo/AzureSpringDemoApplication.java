package com.rajgates.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringDemoApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "This is my first spring azure test deployment \n"
				+ "Testing CI is working fine";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureSpringDemoApplication.class, args);
	}

}
