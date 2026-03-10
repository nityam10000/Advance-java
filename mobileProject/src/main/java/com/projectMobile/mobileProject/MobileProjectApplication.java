package com.projectMobile.mobileProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.projectMobile.mobileProject.entity.Mobile;

@SpringBootApplication
@EnableCaching
public class MobileProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileProjectApplication.class, args);
		
		
	}

}
