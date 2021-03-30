package com.cognizant.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring.Skill;
import com.cognizant.spring.dao.SkillDAO;

@Service
public class SkillService {

	@Autowired
	private SkillDAO skillDAO;
	public List<Skill> getAllDepartments() {
		
		return skillDAO.getAllSkill();
	}

	
}
