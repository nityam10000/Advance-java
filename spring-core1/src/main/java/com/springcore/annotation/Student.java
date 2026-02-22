package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myName")
public class Student {
	@Value("101")
	private int id;
	
	@Value("Nityam")
	private String name;
	public void study() {
		System.out.println("Studying");
	}
}
