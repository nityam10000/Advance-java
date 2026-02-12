package com.bidirectional.otm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Accounts {
	@Id
	private int accNO;
	private String name;
	private double balance;
	
	@JoinColumn
	@ManyToOne
	Bank bank;
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}
	
	public int getAccNO() {
		return accNO;
	}
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}