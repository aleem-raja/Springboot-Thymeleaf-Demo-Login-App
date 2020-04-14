package com.tm.aafhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class AafHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(AafHelloApplication.class, args);
	}

}
