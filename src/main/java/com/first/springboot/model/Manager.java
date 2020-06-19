package com.first.springboot.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Ref : https://geek-docs.com/spring-boot/spring-boot-tutorials/spring-boot-qualifier.html

@Component
@Qualifier("manager")
public class Manager implements Person {
	
	@Override
	public String info() {
		return "manager";
	}
}
