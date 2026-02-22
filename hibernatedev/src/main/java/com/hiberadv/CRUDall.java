package com.hiberadv;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CRUDall {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgre");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Adhaar adh = new Adhaar();
//		adh.setId(101);
//		adh.setState("Jammu");
//		
//		et.begin();
//		em.persist(adh);
//		et.commit();
//		
//		Someone s = new Someone();
//		s.setA(adh);
//		s.setName("OLA");
//		s.setPhone(50000);
//		s.setStudentId(23);
//		
//		et.begin();
//		em.persist(s);
//		et.commit();
		
		Someone s1 = em.find(Someone.class, 23);
		
		Adhaar a = s1.getA();
		a.setState("Kashmir");
		s1.setName("Darksied");
		et.begin();
		em.merge(s1);
		em.merge(a);
		et.commit();
		
//		Utility utl = new Utility();
//		Someone s = new Someone();
//		
//		Scanner sc = new Scanner(System.in);
//		
////		utl.updateSomeoneName(1, "Golaa");
////		utl.updateStudentPhone(1, 98272692);
////		utl.deleteStudent(1);
////		utl.findStudent(2);
//		
//		utl.findall();
	}
}
