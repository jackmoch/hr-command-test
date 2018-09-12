package com.connectyourcare.hr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception exception) {
			LOGGER.error("Failed to start application. Exception thrown: ", exception);
			System.exit(1);
		}
	}
}