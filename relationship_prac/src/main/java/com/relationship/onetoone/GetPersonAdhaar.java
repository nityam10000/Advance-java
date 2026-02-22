package com.relationship.onetoone;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class GetPersonAdhaar {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
//		Adhaar adh = new Adhaar();
//		adh.setId(101);
//		adh.setLocation("Jammu");
//		
		
		Person person = em.find(Person.class, 1);
		System.out.println(person.getAdh());
		
		if(person.equals(null)) {
			
			Person ps = new Person();
			ps.setId(1);
			ps.setName("Nityam");
			ps.setAdh(new Adhaar());
			
			et.begin();
			em.persist(ps);
			et.commit();
//			et.begin();
//			em.remove(person);
//			et.commit();
//			
//			System.out.println("Removed successfully");
		}
		
		
	}
}
