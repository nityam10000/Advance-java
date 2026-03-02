package com.project2.projectApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.projectApp.entity.Company;
import com.project2.projectApp.entity.Employee;
import com.project2.projectApp.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService cs;
	
//	@PostMapping("/company")
//	public String saveComp(@RequestBody Company company) {
//		
//		cs.saveCompany(company);
//		return "saved";
//	}
	@PostMapping("/company")
	public ResponseEntity<Company> saveComp(@RequestBody Company company) {
		Company comp = cs.saveCompany(company);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(comp);
	}
	
	@PostMapping("/company2")
	public ResponseEntity<Company> saveCompMappedByEmployee(@RequestBody Company company) {
		
		Company comp = cs.saveCompanyAndMapWithComapny(company);
		return ResponseEntity.status(HttpStatus.CREATED).body(comp);
	}
	
	@PostMapping("/company/{id}")
	public ResponseEntity<Company> saveNewEmployees(@PathVariable int id, @RequestBody List<Employee> newList) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cs.saveEmployeeToExistingCompany(id, newList));
	}
	
//	@GetMapping("/data/{num1}/{num2}")
//	public String divide(@PathVariable int num1, @PathVariable int num2) {
//		return "Result: "+num1/num2;
//	}
	
	@GetMapping("/company/find{id}")
	public ResponseEntity<Company>  findEmp(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(cs.findCompById(id));
	}

}
