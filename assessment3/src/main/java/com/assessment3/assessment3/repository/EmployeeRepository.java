package com.assessment3.assessment3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assessment3.assessment3.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	//custom method
	@Query("select e from Employee e where e.id=:id")
	Employee getEmployeeById(int id);
	
	@Query("select e from Employee e where e.name=:name")
	List<Employee> getEmployeeByName(String name);
	
	@Query("select e from Employee e where e.department=:department")
	List<Employee> getEmployeeByDepartment(String department);
	
	@Query("select e from Employee e where e.email=:email")
	Employee getEmployeeByemail(String email);
	
	@Query("select e from Employee e where e.phone=:phone")
	Employee getEmployeeByphone(long phone);
	
	
	
}
