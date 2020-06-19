package com.first.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Ref: https://spring.io/guides/gs/serving-web-content/
// Need to remove 'org.springframework.boot:spring-boot-starter-security',
//                'org.springframework.security:spring-security-test'
//           from build.gradle
//     and remove src.main.java.com.first.springboot.securingweb.*
// before running the example.
//
// Test: 
//     curl http://localhost:8080/greeting
//     curl http://localhost:8080/greeting?name=User

@SpringBootApplication
@ComponentScan(value="com.first.springboot")
public class ServingWebContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

}
