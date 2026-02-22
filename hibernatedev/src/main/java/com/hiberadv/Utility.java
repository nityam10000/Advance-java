package com.hiberadv;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Utility implements SomeoneInter{
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	private Someone s;
	static {
		 emf = Persistence.createEntityManagerFactory("postgre");
		 em = emf.createEntityManager();
		 et = em.getTransaction();
	}

	@Override
	public void saveSomeone(Someone s) {
		et.begin();
		em.persist(s);
		et.commit();
	}

	@Override
	public void updateSomeoneName(int id, String name) {
		s = em.find(Someone.class, id);
		try {
			s.setName(name);
			et.begin();
			em.merge(s);
			et.commit();
		}catch(NullPointerException e) {
			System.out.println("Record not found");
			
		}
		
		
	}

	@Override
	public void updateStudentPhone(int id, int phone) {
		s = em.find(Someone.class, id);
		
		if(s.equals(null)) {
			System.out.println("Record not found");
		}else {
			s.setPhone(phone);
			et.begin();
			em.merge(s);
			et.commit();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		
		s = em.find(Someone.class, id);
		try {
			et.begin();
			em.remove(s);
			et.commit();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void findStudent(int id) {
		
		try {
			s = em.find(Someone.class, id);
			System.out.println(s.getStudentId()+"|"+s.getName()+"|"+s.getPhone());
		}catch(NullPointerException e) {
			System.out.println("Record not found");
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void findall() {
		
		Query query = em.createQuery("select s from Someone s");
		List<Someone> student = query.getResultList();
		
		for(Someone s1: student) {
			System.out.println(s1.getStudentId());
			System.out.println(s1.getName());
			System.out.println(s1.getPhone());
			System.out.println("---------------------");
		}
		// TODO Auto-generated method stub
	}
	
	
	
	
	
}
