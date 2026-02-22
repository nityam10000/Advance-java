package com.relationship.onetomany;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subjects {
	@Id
	private int id;
	private String name;
	
	public Subjects() {
		
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

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
