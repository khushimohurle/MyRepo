package com.cg.service;

import java.util.List;

import com.cg.entity.*;
public interface IDepartmentService {
	
	List<Department> getAllDepartment();
	String postDepartment(Department department);

}
