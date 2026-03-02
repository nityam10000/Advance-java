package com.project2.projectApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.projectApp.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
