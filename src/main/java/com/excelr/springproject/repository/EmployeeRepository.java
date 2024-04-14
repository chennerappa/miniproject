package com.excelr.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.springproject.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	 Employee findByName(String name);
	

}
