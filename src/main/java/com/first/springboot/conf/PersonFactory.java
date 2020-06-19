package com.first.springboot.conf;

import com.first.springboot.model.Manager;
import com.first.springboot.model.Person;
import com.first.springboot.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonFactory {

	@Bean
	@Qualifier("student")
	public Person createStudent() {
		return new Student();
	}
	
	@Bean
	@Qualifier("manager")
	public Person createManager() {
		return new Manager();
	}
}
