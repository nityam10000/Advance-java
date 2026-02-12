package com.bidirectional.mtom;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	private int id;
	private String name;
	private double price;
	
	@ManyToMany(mappedBy = "lst")
	private List<Students> std;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Students> getStd() {
		return std;
	}

	public void setStd(List<Students> std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
