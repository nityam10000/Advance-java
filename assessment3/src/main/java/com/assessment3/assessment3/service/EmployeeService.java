package com.assessment3.assessment3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assessment3.assessment3.entity.Employee;
import com.assessment3.assessment3.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addNewEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> findAllEmp() {
		return employeeRepository.findAll();
	}

	public Employee findEmpById(int id) {
		return employeeRepository.getEmployeeById(id);
	}

	public String deleteEmpById(int id) {
		Employee employee = findEmpById(id);
		employeeRepository.delete(employee);

		return "deleted";
	}

	public List<Employee> findEmpByName(String name) {
		return employeeRepository.getEmployeeByName(name);
	}

	public List<Employee> findEmpByDepartment(String department) {
		return employeeRepository.getEmployeeByDepartment(department);
	}

	public Employee findEmpByPhone(long phone) {
		return employeeRepository.getEmployeeByphone(phone);
	}

	public Employee findEmpByEmail(String email) {
		return employeeRepository.getEmployeeByemail(email);
	}
	
	public Employee updateEmployee(int id, Employee employee) {
		Employee emp = findEmpById(id);
		emp.setDepartmanet(employee.getDepartmanet());
		emp.setEmail(employee.getEmail());
		emp.setName(employee.getName());
		emp.setPhone(employee.getPhone());
		emp.setSalary(employee.getSalary());
		
		return employeeRepository.save(employee);
	}

}
