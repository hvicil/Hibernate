package com.hb12.entityman;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RunnerSave12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student12 student = new Student12();

		student.setName("Matrix");
		student.setGrade(95);
		
		//Hibernate'deki SessionFactory'e karisilik geliyor
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentunit");
		//Hibernate session'a karisilik geliyor
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		
		em.persist(student);
		
//		Student12 student1 = em.find(Student12.class, 4);
//		System.out.println(student1);
//		em.remove(student1);
	
      Object result = em.createQuery("FROM Student12 s Where s.name='Matrix'").getSingleResult();
      System.out.println(result);


		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
