package com.cognizant.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring.Employee;
import com.cognizant.spring.dao.EmployeeDAO;
import com.cognizant.spring.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;

	public List<Employee> getAllEmployees(){
		
		return employeeDao.getAllEmployee();
	}
	
	public Employee updateEmployee(Employee employee,int id) throws EmployeeNotFoundException
	{

		return employeeDao.updateEmployee(employee,id);
	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		
		employeeDao.deleteEmployee(id);
		
	}
	
	
}
