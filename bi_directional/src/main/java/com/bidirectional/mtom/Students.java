package com.bidirectional.mtom;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<Courses> lst;

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

	public List<Courses> getLst() {
		return lst;
	}

	public void setLst(List<Courses> lst) {
		this.lst = lst;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	
	
}
