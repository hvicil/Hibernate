package com.hb05.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student05 student1 	= new Student05();
		Book05 book1 		= new Book05();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student05.class)
				.addAnnotatedClass(Book05.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		
//		student1 = session.get(Student05.class, 1001);
//		
//		System.out.println(student1.getName());
//		System.out.println(student1.getBooks().get(0));
//		
		
//		book1=session.get(Book05.class, 101);
//		System.out.println(book1);
		
		
		//HQL ile kitap ismine gore kayit getirme ve kitap sahiplik gorme
		
//		String hqlQuery1 = "From Book05 b where b.name='Math Book'";
//		
//		book1=(Book05) session.createQuery(hqlQuery1).getSingleResult();
//		System.out.println(book1.getName()+":"+book1.getStudents().size());
//		System.out.println("----------------");
//		book1.getStudents().forEach(s->System.out.println(s));
		
		
//		String hqlQuery2 = "from Student05 s where s.name='Matrix'";
//		student1 = (Student05) session.createQuery(hqlQuery2).getSingleResult();
//		//System.out.println(student1.getBooks());
//		student1.getBooks().forEach(b-> System.out.println(b));
		
//		String hqlQuery3 = "Select s.name from Student05 s";
//		List<Object[]> resultList1  =session.createQuery(hqlQuery3).list();
//		System.out.println(resultList1);
		
		String hqlQuery4 = "Select s.name, b.name from Student05 s inner join fetch Book05 b on s.id=1001";
		
		List<Object[]> resultList2 = session.createQuery(hqlQuery4).getResultList();
		resultList2.stream().forEach(s-> System.out.println(Arrays.toString(s)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		tx.commit();
		session.close();
		sf.close();

	}

}
