package com.example.PETCO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class PetcoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetcoApplication.class, args);
	}

}
