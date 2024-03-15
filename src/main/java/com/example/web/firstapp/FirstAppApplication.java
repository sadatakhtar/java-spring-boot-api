package com.example.web.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World")String name){
		return String.format("Hello %s!", name);
	}

//	@GetMapping("/greeting")
//	public String greeting(@RequestParam(value = "name", defaultValue = "anonymous user")String name){
//		return String.format("Hello %s", name);
//	}

}
