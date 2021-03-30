package com.cognizant.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring.Employee;
import com.cognizant.spring.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value="/employees",method = RequestMethod.GET)
	List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployees();
		
	}
}
