package com.bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String location;
	
	@JoinColumn
	@OneToOne
	private Adhar adhar;
	

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

	public Adhar getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}

	
	
	
}
