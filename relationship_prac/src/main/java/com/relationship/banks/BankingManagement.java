package com.relationship.banks;

import java.util.Arrays;
import java.util.List;

public class BankingManagement {
	public static void main(String[] args) {
		Utility util = new Utility();
		
//		Bank bank = new Bank();
//		bank.setId(101);
//		bank.setName("SBI");
//		bank.setLocation("Jammu");
//		
//		Account acc1 = new Account();
//		acc1.setAcc_id(1);
//		acc1.setName("Nityam");
//		acc1.setBalance(30000);
//		acc1.setBank(bank);
//		
//		Account acc2 = new Account();
//		acc2.setAcc_id(2);
//		acc2.setName("Alex");
//		acc2.setBalance(40000);
//		acc2.setBank(bank);
//		
//		Account acc3 = new Account();
//		acc3.setAcc_id(3);
//		acc3.setName("Alexa");
//		acc3.setBalance(5000);
//		acc3.setBank(bank);
//		
//		List<Account> list = Arrays.asList(acc1,acc2,acc3);
//		acc1.setBank(bank);
//		acc2.setBank(bank);
//		acc3.setBank(bank);
//		bank.setAccount(list);
		
		
//		util.saveBank(bank);
		System.out.println(util.findAllAccountsInBank(101));
		System.out.println(util.findAllAccountsInBank(101));
		
	}
}
