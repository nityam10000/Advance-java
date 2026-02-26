package com.mvc3.database.service;


import com.mvc3.database.dao.UserDAO;
import com.mvc3.database.entity.UserDetails;

import jakarta.persistence.EntityManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private UserDAO userDao;
	
	public void save(UserDetails user) {
		
		if(user != null) {
			userDao.saveUser(user);
		}
	}
	
	public String findUser(int userId) {
		UserDetails user = userDao.findUser(userId);
		
		if(user != null) {
			return user.getUserName() +" "+ user.getEmail();
		}
		return "XXX XXX";
	}
	
	public List<UserDetails> findUsers(){
		
		return userDao.findAll();
		
	}
	
	public void deleteU(int userId) {
		userDao.deleteUser(userId);
	}
}
