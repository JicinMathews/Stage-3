package com.cognizant.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring.Department;
import com.cognizant.spring.dao.DepartmentDAO;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	public List<Department> getAllDepartments() {
		
		return departmentDAO.getAllDepartments();
	}

	
}
