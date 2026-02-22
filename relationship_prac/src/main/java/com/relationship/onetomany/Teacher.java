package com.relationship.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	
	@OneToMany
	List<Subjects> subs;
	public Teacher() {
		// TODO Auto-generated constructor stub
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
	public List<Subjects> getSubs() {
		return subs;
	}
	public void setSubs(List<Subjects> subs) {
		this.subs = subs;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subs=" + subs + "]";
	}
	
	
}
