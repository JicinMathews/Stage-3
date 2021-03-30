package com.cognizant.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.spring.Employee;

@Component
public class EmployeeDAO {

	static ArrayList<Employee> EMPLOYEE_LIST;
	public EmployeeDAO() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
	}
	
	public List<Employee> getAllEmployee(){
		return EMPLOYEE_LIST;
	}
	
}
