package com.example.servingwebcontent.controllers;

import org.joda.time.LocalTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hello")
	public String index() {

		LocalTime currentTime = new LocalTime();

		System.out.println("Hi Tushar, greetings from Spring Boot with current local time: " + currentTime);

		return "Hello from HelloRestController!";
	}

}
