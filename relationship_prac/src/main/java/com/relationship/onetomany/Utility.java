package com.relationship.onetomany;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Utility {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
		
//		Subjects s1 = new Subjects();
//		s1.setId(101);
//		s1.setName("Java");
//		
//		Subjects s2 = new Subjects();
//		s2.setId(102);
//		s2.setName("SQL");
//		
//		List<Subjects> subjectList = Arrays.asList(s1,s2);
//		
//		Teacher teacher = new Teacher();
//		
//		teacher.setId(1);
//		teacher.setName("Ravi Kumar Ojha");
//		teacher.setSubs(subjectList);
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(teacher);
//		et.commit();
		
		Teacher th = em.find(Teacher.class, 1);
		
		System.out.println(th.getSubs());
	}
}
