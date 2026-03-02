package com.project2.projectApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.projectApp.entity.Company;
import com.project2.projectApp.entity.Employee;
import com.project2.projectApp.exception.CompanyIdNotFoundException;
import com.project2.projectApp.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository cr;
	
	public Company saveCompany(Company company) {
		return cr.save(company);
	}
	
	public Company findCompById(int id) {
		return cr.findById(id).orElseThrow(()->new CompanyIdNotFoundException("Company "+id+" is not available"));
		
	}
	
	public void deleteById(int id) {
		Company emp = findCompById(id);
		
		cr.delete(emp);
	}
	
	public Company saveCompanyAndMapWithComapny(Company company) {
		 company.getEmployee().forEach((emp)-> emp.setCompany(company));
		 
		 return cr.save(company);
	}
	
	public Company saveEmployeeToExistingCompany(int compId, List<Employee> newEmp) {
		Company company = findCompById(compId);
		
		company.getEmployee().addAll(newEmp);
		return saveCompanyAndMapWithComapny(company);
	}

}
