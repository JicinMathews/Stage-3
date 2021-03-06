package com.cognizant.spring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Skill {
	@NotNull
	private int id;
	@NotNull
	@Size(min = 1, max = 30)
	private String name;

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

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
}
