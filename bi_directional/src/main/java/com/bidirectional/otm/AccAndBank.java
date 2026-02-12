package com.bidirectional.otm;


import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AccAndBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Accounts acc = new Accounts();
		acc.setAccNO(1011);
		acc.setBalance(45000);
		acc.setName("Nityam");
		
		Accounts acc1 = new Accounts();
		acc1.setAccNO(1012);
		acc1.setBalance(55000);
		acc1.setName("Alex");
		
		Accounts acc2 = new Accounts();
		acc2.setAccNO(1013);
		acc2.setBalance(4000);
		acc2.setName("Alexa");
		
		List<Accounts> accc = Arrays.asList(acc,acc1,acc2);
		
		Bank bank = new Bank();
		bank.setAccount(accc);
		bank.setId(1);
		bank.setLocation("Bangalore");
		bank.setName("SBI");
		
		for(Accounts s: accc) {
			s.setBank(bank);
		}
		
		et.begin();
		em.persist(bank);
		em.persist(acc);
		em.persist(acc1);
		em.persist(acc2);
		et.commit();
	}
}
