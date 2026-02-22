package com.hiberadv;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	
	public void fetch() {
		
	}
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgre");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Someone s1 = new Someone();
		s1.setStudentId(1);
		s1.setName("Akram");
		s1.setPhone(9988272);
		
		Someone s2 = new Someone();
		s2.setStudentId(2);
		s2.setName("Abhinav");
		s2.setPhone(1888);
		
		Someone s3 = new Someone();
		s3.setStudentId(3);
		s3.setName("Mohit");
		s3.setPhone(872);
		
		Someone s4 = new Someone();
		s4.setStudentId(4);
		s4.setName("Nityam");
		s4.setPhone(112);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		et.commit();
//		System.out.println(emf);
	}
}