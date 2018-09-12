package com.connectyourcare.hr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@SuppressWarnings("unused")
public class TestController {

	@GetMapping(path = "/greeting")
	public Object testEndpoint(@RequestParam(value = "name", defaultValue = "World!") String name) {
		return new ResponseEntity(String.format("Hello, %s", name), HttpStatus.OK);
	}
}
