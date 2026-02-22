package com.relationship.banks;

import java.util.List;

public interface BankAccCRUD {
	void saveBank(Bank bank);
	void updateBank(int id);
	Bank findBankById(int id);
	Bank findBankByName(String name);
	
	void assignAccountsToBank(int bankId, List<Account> list);
	
	List<Account> findAllAccountsInBank(int bankId);
}
