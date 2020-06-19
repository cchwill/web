package com.first.springboot.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.first.springboot.model.User;



public class UserCustomDeserializer extends JsonDeserializer<User> {
	
	public UserCustomDeserializer() {
	}

	@Override
	public User deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
		JsonNode jsonNode = jp.getCodec().readTree(jp);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String birthDateStr = jsonNode.get("birthDate").asText();
		String userName = jsonNode.get("userName").asText();
		Date birthDate = null;
		try {
			birthDate = sdf.parse(birthDateStr);
		} catch (ParseException pe) {
			System.out.println(pe.getMessage());
		}
		
		return new User(null, userName, birthDate); 
	}
}
