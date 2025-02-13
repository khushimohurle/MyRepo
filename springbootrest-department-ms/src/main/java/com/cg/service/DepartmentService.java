package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cg.entity.Department;
import com.cg.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService{

	@Autowired
	DepartmentRepository departmentrepository;
	@Override
	public List<Department> getAllDepartment() {
		
		return departmentrepository.findAll();
	}
	@Override
	public String postDepartment(Department department) {
		departmentrepository.save(department);
		return "Department Created Successfully";
	}

}
