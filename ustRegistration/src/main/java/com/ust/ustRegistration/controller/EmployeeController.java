package com.ust.ustRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ustRegistration.model.Employee;
import com.ust.ustRegistration.service.EmployeeService;




@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/addemps")
	public Employee addEmployee(@RequestBody Employee employee )
	{
		return employeeService.createEmployee(employee);
	}
	


}
