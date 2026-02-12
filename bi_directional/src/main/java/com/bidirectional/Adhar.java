package com.bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {
	@Id
	private int id;
	private String name;
	
	@OneToOne(mappedBy = "adhar")
	private Person perosn;

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

	public Person getPerosn() {
		return perosn;
	}

	public void setPerosn(Person perosn) {
		this.perosn = perosn;
	}

	
	
	
}
