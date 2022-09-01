package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class Phase3ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3ProjectApplication.class, args);
	}

}
