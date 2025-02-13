package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	EmployeeRepository employeerepository;
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeerepository.findAll();
	}
	@Override
	public String postEmployee(Employee employee) {
		employeerepository.save(employee);
		return "employee created successsfully";
	}

}
