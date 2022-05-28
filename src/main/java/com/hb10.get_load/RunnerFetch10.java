package com.hb10.get_load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student10.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		
		Student10 student1 = new Student10();
		student1 = session.get(Student10.class, 1003);
		System.out.println(student1);
		
		
		Student10 student2 = new Student10();
		//student2 = session.load(Student10.class, 1002);
		System.out.println(student2);
		
		
		

		tx.commit();
		session.close();
		sf.close();

	}

}
