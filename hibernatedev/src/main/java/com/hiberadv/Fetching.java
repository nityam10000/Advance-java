package com.hiberadv;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetching {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgre");
		EntityManager em = emf.createEntityManager();
		
		
		Someone s = em.find(Someone.class, 5);
		
		System.out.println(s.getStudentId());
		System.out.println(s.getName());
		System.out.println(s.getPhone());
	}
}
