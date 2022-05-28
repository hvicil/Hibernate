package com.hb11.object_life_cycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave11 {
	public static void main(String[] args) {
		
		//Transient
		//Hibernate session ile iliskilendirilmemis objenin durumudur
		
		
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student11.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Student11 student1 = new Student11();
		student1.setId(1001);
		student1.setName("Matrix");
		student1.setGrade(95);
		
		//objenin durumu artik persisten oluyor save ettiktten sonra
		//Hibernate ile iliskilendirilmis oluyor: pbject state manage'dir
		//MANAGED STATE
		

		Student11 student2 = new Student11();
		student2.setId(1002);
		student2.setName("Maximus");
		student2.setGrade(98);

		session.save(student1);
		session.save(student2);

		tx.commit();
		
		//DETACHED STATE sesion.close  yapildiginda Obje detached duruma duser
		
		//REMOVE objenin hibernate ile iliskisinin kalmadigini ifade eder
		session.detach(student1);
		session.close();
		sf.close();
	}
}