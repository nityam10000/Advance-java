package com.relationship.manytoone;


import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Utitity {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Company company = new Company();
//		company.setId(101);
//		company.setName("Capgemini");
//		company.setLocation("Bangalore");
//		
//		
//		Employee e1 = new Employee();
//		e1.setId(1);
//		e1.setName("Nityam");
//		e1.setSalary(35666);
//		e1.setCompany(company);
//		
//		Employee e2 = new Employee();
//		e2.setId(2);
//		e2.setName("Alex");
//		e2.setSalary(34966);
//		e2.setCompany(company);
//		
//		Employee e3 = new Employee();
//		e3.setId(3);
//		e3.setName("Alexa");
//		e3.setSalary(356766);
//		e3.setCompany(company);
		
//		et.begin();
//		em.persist(company);
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		et.commit();
		
		List<Employee> employee = em.createQuery("SELECT emp FROM Employee emp", Employee.class).getResultList();
		
		System.out.println(employee);
		
	}
}
