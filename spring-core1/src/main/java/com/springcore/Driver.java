package com.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] arg) {
	
//	BeanFactory b;
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	System.out.println("Main started..");
//	Laptop laptop = context.getBean("myLap",Laptop.class);//IOC
	Student student = context.getBean("myStudent",Student.class);//IOC
	Employee employee = context.getBean("myEmployee",Employee.class);//IOC
	College college = context.getBean("myCollege",College.class);//IOC
	employee.laptop.laptop();
	
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	employee.work();
	student.study();
	college.milk();
	System.out.println("Main ended");
	
}
}
