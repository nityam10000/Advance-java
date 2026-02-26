package com.mvc3.database.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mvc3.MyConfig;
import com.mvc3.database.entity.UserDetails;
import com.mvc3.database.service.UserService;

public class DatabaseController {
	
	private ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
	private UserService us = ac.getBean(UserService.class,"userservice");

	
	public void registerUser(String username, String email) {
		UserDetails user = new UserDetails(username,email);
		
		us.save(user);
	}
	
	public String findU(int userId) {
		
		String user = us.findUser(userId);
		
		return user;
	}
	
	public List<UserDetails> findAllUsers(){
		
		return us.findUsers();
	}
	
	public void deleteUser(int userId) {
		us.deleteU(userId);
	}
}
