package com.hb06.idgenerationstrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student06 {
	
	@Id
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STD_SEQ")
//	@SequenceGenerator(name="STD_SEQ",initialValue = 1000, allocationSize = 10)
	
//	@GeneratedValue(generator = "UUID")
//	@GenericGenerator(name="UUID", strategy = "uuid2")
//	private String id;
	
	
//	@GeneratedValue(strategy=GenerationType.TABLE)
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	private String name;
	
	private int grade;
	

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
