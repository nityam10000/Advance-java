package com.assessment3.assessment3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment3.assessment3.entity.Employee;
import com.assessment3.assessment3.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService emplaoService;
	
	@GetMapping("/employee")
	public String getEmp() {
		return emplaoService.findAllEmp().toString();
	}
	
	@RequestMapping("/employee")
	public String getEmpUsingId(@RequestParam int id) {
		 return emplaoService.findEmpById(id).toString();
	}
	
	@DeleteMapping("/employee")
	public String deleteEmpUsingId(@RequestParam int id) {
		return emplaoService.deleteEmpById(id);
	}
	
	@PostMapping("/employee")
	public String saveEmp(@RequestBody Employee employee) {
		emplaoService.addNewEmp(employee);
		
		return "saved";
	}
	
	 // Search by name
    @GetMapping("/search/name")
    public List<Employee> searchByName(@RequestParam String name) {
        return emplaoService.findEmpByName(name);
    }

    // Search by department
    @GetMapping("/search/department")
    public List<Employee> searchByDepartment(@RequestParam String department) {
        return emplaoService.findEmpByDepartment(department);
    }

    // Search by phone
    @GetMapping("/search/phone")
    public Employee searchByPhone(@RequestParam long phone) {
        return emplaoService.findEmpByPhone(phone);
    }

    // Search by email
    @GetMapping("/search/email")
    public Employee searchByEmail(@RequestParam String email) {
        return emplaoService.findEmpByEmail(email);
    }

    @PutMapping("/employee/update")
    public String updateEmp(@RequestParam int id, @RequestBody Employee employee) {
    	
    	emplaoService.updateEmployee(id, employee);
    	
    	return emplaoService.updateEmployee(id, employee).toString();
    }
	
	
}
