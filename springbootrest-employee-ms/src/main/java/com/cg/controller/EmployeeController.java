package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;

@RestController
@RequestMapping("/eapi")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeservice.getAllEmployee();
	}
	
	@PostMapping("/employees")
	public String postEmployee(@RequestBody Employee employee) {
		String response=employeeservice.postEmployee(employee);
		return response;
	}

}
