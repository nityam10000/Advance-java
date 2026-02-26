package com.mvc3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ComponentScan(basePackages = {"com.mvc3","com.mvc3.database.service","com.mvc3.database.dao"})
@Configuration
public class MyConfig {
	@Bean
	public EntityManagerFactory getEMF() {
		return Persistence.createEntityManagerFactory("postgre");
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver iv = new InternalResourceViewResolver();
		iv.setPrefix("/WEB-INF/views/");
		iv.setSuffix(".jsp");
		
		return iv;
	}
	
}
