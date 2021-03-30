package com.cognizant.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring.Employee;
import com.cognizant.spring.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;

	public List<Employee> getAllEmployees(){
		
		return employeeDao.getAllEmployee();
	}
	
	
	
}
