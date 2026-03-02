package com.project2.projectApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.projectApp.dto.EmployeeDTO;
import com.project2.projectApp.entity.Employee;
import com.project2.projectApp.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository er;
	
	public EmployeeDTO saveEmployee(EmployeeDTO empDTO) {
		
		Employee employee = DTOtoEntity(empDTO);
		er.save(employee);
		
		return entityToDTO(employee);
	}
	
	public Employee findEmpById(int id) {
		return  er.findById(id).orElse(null);
	}
	
	public void deleteById(int id) {
		Employee emp = findEmpById(id);
		
		er.delete(emp);
	}
	
	public EmployeeDTO entityToDTO(Employee employee) {
		EmployeeDTO empDTO = new EmployeeDTO();
		
		empDTO.setEmail(employee.getEmail());
		empDTO.setName(employee.getName());
		empDTO.setPhone(employee.getPhone());
		empDTO.setAge(employee.getAge());
		
		return empDTO;
		
	}
	
	public Employee DTOtoEntity(EmployeeDTO empDto) {
		
		Employee emp = new Employee();
		
		emp.setAge(empDto.getAge());
		emp.setName(empDto.getName());
		emp.setPhone(empDto.getPhone());
		emp.setEmail(empDto.getEmail());
		
		return emp;
	}
}
