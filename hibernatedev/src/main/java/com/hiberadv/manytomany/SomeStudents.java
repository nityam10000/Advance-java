package com.hiberadv.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class SomeStudents {
	@Id
	private int id;
	private String name;
	private int phone;
	
	@ManyToMany
	List<Subjects> lst;
	
	
	public List<Subjects> getLst() {
		return lst;
	}
	public void setLst(List<Subjects> lst) {
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
