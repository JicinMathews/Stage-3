package com.cognizant.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring.Employee;
import com.cognizant.spring.service.EmployeeService;
import com.cognizant.spring.service.exception.EmployeeNotFoundException;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();

	}

	@PutMapping(value = "/employees/{id}")
	public Employee updateEmployee(@Valid @RequestBody Employee employee,@PathVariable int id) throws EmployeeNotFoundException {
		LOGGER.info("Start updateEmployee()");
		LOGGER.info("End updateEmployee()");
		return employeeService.updateEmployee(employee,id);
	}

	@DeleteMapping(value="/employees/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void deleteEmployee(@PathVariable int id) throws EmployeeNotFoundException {
		LOGGER.info("Start deleteEmployee()");
		employeeService.deleteEmployee(id);
		LOGGER.info("End deleteEmployee()");
	}
}
