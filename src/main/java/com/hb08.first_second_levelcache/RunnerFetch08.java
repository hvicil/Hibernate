package com.hb08.first_second_levelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student08 student1 = new Student08();
		Student08 student2 = new Student08();
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student08.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		//1.Level Cache 1.senaryo
		
//		student1= session.get(Student08.class, 1L);
//		System.out.println("*******************");
//		System.out.println(student1);
//		
//		//Eger first level cache'i temizlemek istersek session.clear ile yapilabilir
//		//session.clear();
//		
//		System.out.println("*******************");
//		student1= session.get(Student08.class, 1L);
//		System.out.println(student1);
//		System.out.println("*******************");
		
		//1.Level Cache 2.seneryo
//		
//		student1= session.get(Student08.class, 1L);
//		System.out.println("*******************");
//		System.out.println(student1);
//		
//		
//		System.out.println("*******************");
//		student1= session.get(Student08.class, 2L);
//		System.out.println(student1);
//		System.out.println("*******************");
		
		
		//2.Level 1. Seneryo
		
		student1 = session.get(Student08.class, 1L);
		System.out.println(student1);
		tx.commit();
		session.close();
		
		Session session2 = sf.openSession();
		
		Transaction tx2 = session2.beginTransaction();
		
		student2 = session2.get(Student08.class, 1L);
		System.out.println(student2);
		
		
		tx2.commit();
		session2.close();
		
		sf.close();
		
		
//		tx.commit();
//		session.close();
//		sf.close();
		
		

	}

}
