package com.cognizant.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


import com.cognizant.spring.Skill;

@Component
public class SkillDAO {

	static ArrayList<Skill> SKILL_LIST;
	public SkillDAO() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		SKILL_LIST = (ArrayList<Skill>) context.getBean("skillList");
	}
	
	public List<Skill> getAllSkill(){
		return SKILL_LIST;
	}
	
}
