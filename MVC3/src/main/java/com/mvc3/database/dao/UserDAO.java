package com.mvc3.database.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvc3.database.entity.UserDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component
public class UserDAO {
	
	@Autowired
	private EntityManagerFactory emf;
	
	public void saveUser(UserDetails user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(user);
		et.commit();
		em.close();
	}
	
	public UserDetails findUser(int userId) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		UserDetails user = em.find(UserDetails.class, userId);
		
		return user;
	}
	
	public List<UserDetails> findAll(){
		EntityManager em = emf.createEntityManager();
		
		List<UserDetails> list = em.createQuery("SELECT u from UserDetails u",UserDetails.class).getResultList();
		em.close();
		
		return list;
		
	}
	
	public void deleteUser(int userId) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		UserDetails userDetails = em.find(UserDetails.class, userId);
		
		et.begin();
		em.remove(userDetails);
		et.commit();
		em.close();
	}
}
