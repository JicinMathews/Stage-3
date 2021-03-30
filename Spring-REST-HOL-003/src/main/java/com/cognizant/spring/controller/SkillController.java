package com.cognizant.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring.Skill;
import com.cognizant.spring.service.SkillService;

@RestController
public class SkillController {

	@Autowired
	private SkillService skillService;
	
	@RequestMapping(value="/skills", method = RequestMethod.GET)
	public List<Skill> getAllDepartments(){
		
		return skillService.getAllDepartments();
	}
}
