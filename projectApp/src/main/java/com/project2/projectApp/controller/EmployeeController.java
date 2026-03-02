package com.project2.projectApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.projectApp.dto.EmployeeDTO;
import com.project2.projectApp.entity.Employee;
import com.project2.projectApp.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@PostMapping("/employee")
	public EmployeeDTO  saveEmp(@Valid @RequestBody EmployeeDTO employee) {
		return es.saveEmployee(employee);
		
	}
}
