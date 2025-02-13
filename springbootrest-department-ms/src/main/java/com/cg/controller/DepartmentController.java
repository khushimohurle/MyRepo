package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Department;
import com.cg.feign.DepartmentFeignClient;
import com.cg.service.DepartmentService;

@RestController
@RequestMapping("/dapi")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice;
	
	@Autowired
	DepartmentFeignClient departmentfeign;
	
	@GetMapping("/department")
	public List<Department> getDepartment(){
		return departmentservice.getAllDepartment();
	}
	
	@PostMapping("/department")
	public String postEmployee(@RequestBody  Department department) {
		String response=departmentservice.postDepartment(department);
		return response;
	}
	
	@GetMapping("/allemp")
	public ResponseEntity<String> getEmployee(){
		return ResponseEntity.ok().body(departmentfeign.employeeResponse());
	}

}
