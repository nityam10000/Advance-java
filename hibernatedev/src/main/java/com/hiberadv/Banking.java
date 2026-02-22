package com.hiberadv;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Banking {
	public static void main(String[] srgd) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgre");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Account acc1 = new Account();
//		
//		acc1.setId(101);
//		acc1.setName("NItyam");
//		acc1.setBalance(23000);
//		
//		Account acc2 = new Account();
//		
//		acc2.setId(102);
//		acc2.setName("Alex");
//		acc2.setBalance(24000);
//		
//		Bank bk = new Bank();
//		
//		bk.setId(1);
//		bk.setLocation("Jammu");
//		bk.setName("SBI");
//		
//		List<Account> lst = new ArrayList<Account>();
//		
//		lst.add(acc1);
//		lst.add(acc2);
//		bk.setLst(lst);
//		
//		et.begin();
//		em.persist(acc1);
//		em.persist(acc2);
//		em.persist(bk);
//		et.commit();
		
		Bank id = em.find(Bank.class, 1);
		
		System.out.println(id);
		
//		bk.getLst().add(acc1);
//		bk.getLst().add(acc2);
	}
}
