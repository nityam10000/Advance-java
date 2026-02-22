package com.hiberadv;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Bank {
	
	@Id
	private int id;
	private String name;
	private String location;
	
	@OneToMany
	private List<Account> lst = new ArrayList<Account>();
	
	public List<Account> getLst() {
		return lst;
	}
	public void setLst(List<Account> lst) {
		this.lst = lst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", location=" + location + ", lst=" + lst + "]";
	}
	public Bank(){
		
	}
}
