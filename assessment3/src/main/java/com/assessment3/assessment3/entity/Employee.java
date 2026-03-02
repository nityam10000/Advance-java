package com.assessment3.assessment3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private long phone;
	private String email;
	private double salary;
	private String department;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, long phone, String email, double salary, String departmanet, String department) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.department = department;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmanet() {
		return department;
	}
	public void setDepartmanet(String departmanet) {
		this.department = departmanet;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", salary=" + salary
				+ ", departmanet=" + department + "]";
	}
	
	
	

}
