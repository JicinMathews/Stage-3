package com.cognizant.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.spring.Employee;
import com.cognizant.spring.service.exception.EmployeeNotFoundException;

@Component
public class EmployeeDAO {

	static ArrayList<Employee> EMPLOYEE_LIST;

	public EmployeeDAO() {

		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
	}

	public List<Employee> getAllEmployee() {
		return EMPLOYEE_LIST;
	}

	public Employee updateEmployee(Employee employee,int id) throws EmployeeNotFoundException {

		for (Employee emp : EMPLOYEE_LIST) {
			if (emp.getId() == employee.getId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				emp.setPermanent(employee.getPermanent());
				emp.setDateOfBirth(employee.getDateOfBirth());
				emp.setDepartment(employee.getDepartment());
				emp.setSkill(employee.getSkill());

				return employee;
			}
		}
		throw new EmployeeNotFoundException();
	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = null;
		for (Employee employee : EMPLOYEE_LIST) {
			if (employee.getId() == id) {
				emp = employee;
				EMPLOYEE_LIST.remove(emp);
				break;
			}
		}
		if (emp == null) {
			throw new EmployeeNotFoundException();
		}
	}
}
