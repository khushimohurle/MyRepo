package com.cg.service;

import java.util.List;

import com.cg.entity.*;
public interface IEmployeeService {
	
	List<Employee> getAllEmployee();
	String postEmployee(Employee employee);

}
