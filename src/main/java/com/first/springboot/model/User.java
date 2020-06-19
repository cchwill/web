package com.first.springboot.model;

import java.util.Date;

//import org.springframework.context.annotation.Bean;

import com.first.springboot.util.UserCustomDeserializer;
import com.first.springboot.util.UserCustomSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

// Ref: https://tpu.thinkpower.com.tw/tpu/articleDetails/1761
// Imitate methods mentioned above.

@JsonSerialize(using = UserCustomSerializer.class)
@JsonDeserialize(using = UserCustomDeserializer.class)
public class User {
	
	private Integer id = 0;
	private String name = "";
	private Date birthDate = null;
	
	public User(Integer id, String name, Date birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}	
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	@Override
	public String toString() {
		return "User [id =" + id
				+ "name = " + name
				+ "birthDate = " + birthDate.toString() 
			    + "]";
	}

}
