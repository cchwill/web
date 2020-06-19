package com.first.springboot.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.first.springboot.model.User;


// Ref: https://tpu.thinkpower.com.tw/tpu/articleDetails/1761#
// Author: 蔡維宇 2019/12/31 11:54:30
// Imitate methods happen in UserResource
@Service
public class UserDAOService {

	public List<User> findAll() {
		List<User> listUsers = new ArrayList<User>();
		listUsers.add(new User(0, "allUsers", new Date()));
		return listUsers;
	}
	
	public User findOne(Integer id) {
//		User user = null;
		return new User(0, "oneUser", new Date());
	}
	
	public User save(User user) {
		User savedUser = user;
		savedUser.setName("beSavedUser");
		System.out.println("savedUser : " + savedUser.toString());
		return savedUser;
	}
	
	public User deleteById(Integer id) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("%yyyy-MM-dd HH:mm:ss z");
		System.out.println(sdf.format(date));
		User user = new User(id, "beDeletedUser", date);
		return user;
	}
	
}
