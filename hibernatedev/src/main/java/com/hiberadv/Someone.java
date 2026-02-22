package com.hiberadv;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Someone {
	
	@Id
	private int studentId;
	private String name;
	private long phone;
	
	@OneToOne
	private Adhaar a;
	


	public Adhaar getA() {
		return a;
	}

	public void setA(Adhaar a) {
		this.a = a;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public Someone() {
		
	}
}