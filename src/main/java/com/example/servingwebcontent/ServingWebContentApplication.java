package com.example.servingwebcontent;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServingWebContentApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ServingWebContentApplication.class, args);

		SpringApplication app = new SpringApplication(ServingWebContentApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8787"));
		app.run(args);
	}

}
