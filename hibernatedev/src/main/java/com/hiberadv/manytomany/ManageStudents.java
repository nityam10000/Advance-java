package com.hiberadv.manytomany;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ManageStudents {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgre");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subjects sb = new Subjects();
		sb.setId(101);
		sb.setName("Java");
		sb.setPrice(1000);
		
		List<Subjects> lst = Arrays.asList(sb);
		
		SomeStudents ss = new SomeStudents();
		ss.setId(1);
		ss.setName("NItyam");
		ss.setPhone(123);
		ss.setLst(lst);
		
		SomeStudents ss1 = new SomeStudents();
		ss1.setId(2);
		ss1.setName("Alex");
		ss1.setPhone(23);
		ss1.setLst(lst);
		
		et.begin();
		em.persist(sb);
		em.persist(ss1);
		em.persist(ss1);
		et.commit();
	}
}
