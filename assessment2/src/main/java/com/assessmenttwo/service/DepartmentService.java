package com.assessmenttwo.service;

import com.assessmenttwo.dao.DepartmentDAO;
import com.assessmenttwo.entity.Department;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class DepartmentService {

	@Autowired
    private DepartmentDAO departmentDAO;
	
	@Cacheable(value = "departments", key = "#departmentId")

    public void setDepartmentDAO(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }

	@CachePut(value = "departmentsByName", key = "#name")
    public Department addDepartment(String name) {
        return departmentDAO.addDepartment(name);
    }

	
    public Department saveDepartment(Department department) {
        return departmentDAO.saveDepartment(department);
    }

    public void updateDepartment(int departmentId, String name) {
        departmentDAO.updateDepartment(departmentId, name);
    }

    public Department getDepartment(int departmentId) {
        return departmentDAO.findOne(departmentId);
    }

    @CacheEvict(value = "departments", key = "#departmentId")
    public void deleteDepartment(int departmentId) {
        departmentDAO.deleteDepartment(departmentId);
    }
}