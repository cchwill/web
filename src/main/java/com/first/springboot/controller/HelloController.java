package com.first.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
//	@Value("${management.endpoints.web.exposure.exclude}")
//	private String exclude;

	@RequestMapping("")
	public String index() {
//		System.out.println("management.endpoints.web.exposure.exclude: " + exclude);
		return "Greetings from my first Spring Boot!";
	}
	
}
