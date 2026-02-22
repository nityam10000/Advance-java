package com.springcore;

public class Employee {
	int id;
	String name;
	Laptop laptop;
	
	Employee(int id, String name, Laptop laptop){
		this.id = id;
		this.name = name;
		this.laptop = laptop;
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

	public void work() {
		System.out.println("Working");
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}
