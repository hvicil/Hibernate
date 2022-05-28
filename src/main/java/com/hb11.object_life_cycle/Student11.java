package com.hb11.object_life_cycle;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student11 {
	
	@Id
	private int id;
	
	private String name;
	
	private int grade;
	
	
	
	
	

	@Override
	public String toString() {
		return "Student11 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}