package com.hiberadv;

import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Updating {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgre");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		Someone s = em.find(Someone.class, id);
		
		
		if(s.equals(null)) {
			System.out.println("No record");
		}else {
			
			s.setPhone(0001);
			
			et.begin();
			em.merge(s);
			et.commit();
		}
		
	}
}
