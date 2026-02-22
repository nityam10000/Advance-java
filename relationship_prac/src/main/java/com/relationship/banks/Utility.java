package com.relationship.banks;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Utility implements BankAccCRUD{
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	static {
		emf = Persistence.createEntityManagerFactory("dev");
		em = emf.createEntityManager();
		et = em.getTransaction();
	}
	
	@Override
	public void saveBank(Bank bank) {
		
		et.begin();
		em.persist(bank);
		et.commit();
		
		System.out.println("Bank added");
	}
	
	
	
	@Override
	public void updateBank(int id) {
		Bank b = findBankById(id);
		
		b.setLocation("Updated loc");
		
		et.begin();
		em.merge(b);
		et.commit();
	}

	@Override
	public Bank findBankById(int id) {
		Bank b = em.find(Bank.class, id);
		return b;
	}

	@Override
	public Bank findBankByName(String name) {
		Bank b = em.find(Bank.class, name);
		return b;
	}

	

	@Override
	public void assignAccountsToBank(int bankId, List<Account> list) {
		Bank s = findBankById(bankId);
		s.setAccount(list);
		
	}

	@Override
	public List<Account> findAllAccountsInBank(int bankId) {
		
		Bank bk = findBankById(bankId);
		
		return bk.getAccount();
	}
	
	
	
	
}
