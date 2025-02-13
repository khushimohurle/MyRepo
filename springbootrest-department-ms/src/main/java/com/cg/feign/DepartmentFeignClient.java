package com.cg.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
//name-department application name , url is employee url +port number in which it is running.
@FeignClient(name="employee-service",url="http://localhost:8080")
public interface DepartmentFeignClient {

	@GetMapping("/eapi/employees")
	public String employeeResponse();
}
