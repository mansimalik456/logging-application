package com.loggingDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		
		LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);

	}

}
