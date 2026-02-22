package com.relationship.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Adhaar {
	@Id
	private int id;
	private String location;
	
	public Adhaar() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Adhaar [id=" + id + ", location=" + location + "]";
	}
	
	
}
