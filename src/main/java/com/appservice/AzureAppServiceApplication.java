package com.appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureAppServiceApplication.class, args);
	}
	
	@GetMapping("/")
	public String message() {
		return "Hello Everyone this is Aravinth";
	}
	
	@GetMapping("/msg")
	public String messages() {
		return "This is production";
	}

}
