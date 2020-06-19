package com.first.springboot.util;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.first.springboot.model.User;
//import org.apache.catalina.User;
//import org.apache.tomcat.jni.User;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

//Ref: https://tpu.thinkpower.com.tw/tpu/articleDetails/1761
public class UserCustomSerializer extends JsonSerializer<User>{
	
	public UserCustomSerializer() {
	}

	@Override
	public void serialize(User user, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeStartObject();
		gen.writeNumberField("userId", user.getId());
		gen.writeStringField("userName", user.getName());
		gen.writeObjectField("birthDate", user.getBirthDate());
		gen.writeEndObject();
	}
}
