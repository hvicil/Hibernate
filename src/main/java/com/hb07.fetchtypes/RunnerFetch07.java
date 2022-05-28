package com.hb07.fetchtypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student07 student1 = new Student07();
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student07.class)
				.addAnnotatedClass(Book07.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		student1 = session.get(Student07.class,1002);
		System.out.println(student1);
		
		
		
		tx.commit();

		session.close();
		
//		System.out.println(student1);
		
		
		sf.close();
		

	}

}
