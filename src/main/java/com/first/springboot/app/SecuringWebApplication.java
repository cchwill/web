package com.first.springboot.securingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Ref: https://spring.io/guides/gs/securing-web/
// Related:
//         com.first.springboot.securingweb.MvcConfig.java
//         com.first.springboot.securingweb.WebSecurityConfig.java
//         /src/main/resources/templates/hello.html
//         /src/main/resources/templates/home.html
//         /src/main/resources/templates/login.html
//
//Test: 
//    http://localhost:8080/  (open it in the browser)
//    http://localhost:8080/login  (open it in the browser, with ID:'user' and PW:'password')

//@SpringBootApplication
//@ComponentScan(value="com.first.springboot")
public class SecuringWebApplication {
	
	public static void main(String[] args) throws Throwable {
		SpringApplication.run(SecuringWebApplication.class, args);
	}

}
