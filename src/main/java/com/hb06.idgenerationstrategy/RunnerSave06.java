package com.hb06.idgenerationstrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb05.manytomany.Book05;
import com.hb05.manytomany.Student05;

public class RunnerSave06 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student06 student1 = new Student06();
		Student06 student2 = new Student06();
		Student06 student3 = new Student06();
		
		
		student1.setName("Matrix");
		student1.setGrade(85);
	
		
		
		student2.setName("Maximus");
		student2.setGrade(75);
	
		
		
		student3.setName("Paul");
		student3.setGrade(95);
	
		
		
		
		
		
		
		
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student06.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
		
		
	}

}
