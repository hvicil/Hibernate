package com.hb02.ambeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student02 {
	
	//@Id annotation altýndaki deðiþkenin  primary key yapar.
		//Bu annotasyon her Entity sýnýfýnda olmalý  
		@Id
		private int id;
		
		
		/*
		 * Eðer tablodaki kolon ismini deðiþken isminden farklý bir isim olarak
		 * oluþturmak istersek @Column(name="student_name") bu þekilde kullanabiliriz.
		 */
		
		@Column(name="student_name")
		private String name;
		
		@Column
		private int grade;
		
		
		private Course02 courses;

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
		
		public Course02 getCourses() {
			return courses;
		}
		
		public void setCourses(Course02 courses) {
			this.courses = courses;
		}
	
		
		@Override
		public String toString() {
			return "Student02 [id=" + id + ", name=" + name + ", grade=" + grade + ",courses="+courses+"]";
		}




}