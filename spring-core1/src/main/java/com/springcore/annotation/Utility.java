package com.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Utility {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		//Does not inject reference
		Student s = ac.getBean("myStudent",Student.class);
		
		s.study();
	}

}
