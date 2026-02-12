package com.bidirectional.mtom;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Utility {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Students std1 = new Students();
//		std1.setId(1);
//		std1.setName("Nityam");
//		
//		Students std2 = new Students();
//		std2.setId(2);
//		std2.setName("Alex");
//		
//		Students std3 = new Students();
//		std3.setId(3);
//		std3.setName("Alexa");
//		
//		Courses cr1 = new Courses();
//		cr1.setId(101);
//		cr1.setName("Java");
//		cr1.setPrice(2000);
//		
//		Courses cr2 = new Courses();
//		cr2.setId(102);
//		cr2.setName("SQL");
//		cr2.setPrice(1000);
//		
//		List<Students> lst = Arrays.asList(std1,std2,std3);
//		List<Courses> lst2 = Arrays.asList(cr1,cr2);
//		
//		cr1.setStd(lst);
//		cr2.setStd(lst);
//		
//		std1.setLst(lst2);
//		std2.setLst(lst2);
//		std3.setLst(lst2);
//		
//		et.begin();
//		em.persist(std1);
//		em.persist(std2);
//		em.persist(std3);
//		em.persist(cr1);
//		em.persist(cr2);
//		et.commit();
		
		Students std = em.find(Students.class, 1);
		
//		List<Courses> crs = std.getLst();
//		
//		Iterator<Courses> itr = crs.iterator();
//		
//		while(itr.hasNext()) {
//			
//		}
		
		System.out.println(std);
//		
//		et.begin();
//		em.merge(std);
//		et.commit();
		
		
		
	}
}
