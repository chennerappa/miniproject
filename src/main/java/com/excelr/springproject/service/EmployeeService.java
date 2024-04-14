package com.excelr.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.springproject.entity.Employee;
import com.excelr.springproject.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee emp) {
		return repository.save(emp);
	}

	public List<Employee> saveEmployees(List<Employee> emp) {
		return repository.saveAll(emp);
	}

	public List<Employee> getEmployee() {
		return repository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);

	}

	public Employee getEmployeeByName(String name) {
		return repository.findByName(name);
	}

	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee removed !! " + id;
	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
		existingEmployee.setName(employee.getName());
		existingEmployee.setDept(employee.getDept());
		existingEmployee.setSalary(employee.getSalary());
		return repository.save(existingEmployee);
	}

}
