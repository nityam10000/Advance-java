package com.bidirectional;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Utility {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(1);
		p.setLocation("India");
		
		Adhar adhar = new Adhar();
		adhar.setId(101);
		adhar.setName("NItyam");
		
		p.setAdhar(adhar);
		adhar.setPerosn(p);
		
		et.begin();
		em.persist(adhar);
		em.persist(p);
		et.commit();
	}
}
