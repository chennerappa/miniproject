package com.excelr.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.springproject.entity.Employee;
import com.excelr.springproject.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@PostMapping("/addemployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employee) {
		return service.saveEmployees(employee);
	}

	@GetMapping("/Employees")
	public List<Employee> findallEmployee() {
		return service.getEmployee();
	}
	@GetMapping("/EmployeeByid/{id}")
	public Employee findEmployeeByid( @PathVariable  int id) {
		return service.getEmployeeById(id);
	}
	@GetMapping("/Employee/{name}")
	public Employee findEmployeeByName( @PathVariable String name) {
		return service.getEmployeeByName(name);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	@DeleteMapping("/delete/{id}")
	public String  deleteemployee( @PathVariable  int id) {
		return service.deleteEmployee(id);
	}
	

}
