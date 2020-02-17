package com.h2rr.springboot.crud_demo.service;

import java.util.List;

import com.h2rr.springboot.crud_demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
