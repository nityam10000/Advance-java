package com.hiberadv;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmpComp {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgre");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Company company = new Company();
//		company.setId(101);
//		company.setLocation("Bangalore");
//		company.setName("Capgemini");
//		
//		Employee e1 = new Employee();
//		e1.setId(1);
//		e1.setName("NItyam");
//		e1.setSal(30000);
//		e1.setCompany(company);
//		
//		Employee e2 = new Employee();
//		e2.setId(2);
//		e2.setName("Alex");
//		e2.setSal(4000);
//		e2.setCompany(company);
//		
//		
//		et.begin();
//		em.persist(company);
//		em.persist(e1);
//		em.persist(e2);
//		et.commit();
//		
		Employee emp = em.find(Employee.class, 1);
		
		System.out.println(emp.getCompany());
	}
}
