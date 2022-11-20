package com.hamzablm.debugme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DebugmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebugmeApplication.class, args);
	}

}

@RestController
class MyController {

	private final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

	@GetMapping("/debugme")
	public ResponseEntity<String> debugMe() {
		LOGGER.info("entering debugMe rest api");
		return ResponseEntity.ok("Hello World");
	}
}
