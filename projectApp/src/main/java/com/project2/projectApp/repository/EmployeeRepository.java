package com.project2.projectApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.projectApp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
