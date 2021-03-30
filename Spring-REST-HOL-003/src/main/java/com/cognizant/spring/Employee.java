package com.cognizant.spring;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class Employee {

	@NotNull
	private int id;
	@NotNull
	@Size(min = 1, max = 30)
	private String name;
	@NotNull
	@Min(value = 0)
	private double salary;
	@NotNull
	private String permanent;
	@NotNull
	private Department department;
	@NonNull
	private Skill skill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPermanent() {
		return permanent;
	}
	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", department=" + department + ", skill=" + skill + "]";
	}
}
