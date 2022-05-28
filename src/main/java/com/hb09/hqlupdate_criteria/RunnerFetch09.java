package com.hb09.hqlupdate_criteria;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RunnerFetch09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student09 student1 = new Student09();
		
		
        Configuration con=new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student09.class);
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx= session.beginTransaction();
        
        
//        student1= session.get(Student09.class, 1);
//        student1.setName("Updated: "+student1.getName());
//        session.update(student1);
        
//        String hqlQuery1 = "Update Student09 s Set s.name= 'Updated with HQL' Where s.id=2";
//        int numOfRecord = session.createQuery(hqlQuery1).executeUpdate();
//        System.out.println(numOfRecord);
        
//        String hqlQuery2 = "Update Student09 s set s.grade=100 where s.grade>90 ";
//        int numOfRecord = session.createQuery(hqlQuery2).executeUpdate();
//        System.out.println(numOfRecord);
        
//        String hqlQuery3 = "Update Student09  s set s.grade=50 where s.grade<50";
//        int numOfRecord3 = session.createQuery(hqlQuery3).executeUpdate();
//        System.out.println(numOfRecord3);
        
        
        //Criteria API Examples
        
        
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student09> criteriaQuery = cb.createQuery(Student09.class);
        Root<Student09> root = criteriaQuery.from(Student09.class);
//        criteriaQuery.select(root);
//        criteriaQuery.select(root).where(cb.equal(root.get("name"),"Random name3"));
//        Query<Student09> query=	session.createQuery(criteriaQuery);
//        List<Student09> resultList1 = query.getResultList();
//        resultList1.forEach(r ->System.out.println(r));
        
        //Iki kosulu birlestirerek Criteria kullanimi
        
//        Predicate predicateForName =cb.equal(root.get("name"),"Random name3");
//        Predicate predicateForGt50 = cb.gt(root.get("grade"), 50);
//        
//        Predicate predicateStd = cb.and(predicateForName, predicateForGt50);
//        criteriaQuery.where(predicateStd);
//        
//        Query<Student09> query=	session.createQuery(criteriaQuery);
//        List<Student09> resultList1 = query.getResultList();
//        resultList1.forEach(r ->System.out.println(r));
        
        	
        //Aggregate function(sum)
        
        //tum ogrencilerin notlarinin toplamini hesaplamak/getirmek istiyorum
        CriteriaBuilder cb1 = session.getCriteriaBuilder();
        CriteriaQuery<Integer> criteriaQueryInteger = cb1.createQuery(Integer.class);
        
        Root<Student09> root1 = criteriaQueryInteger.from(Student09.class);
        
        criteriaQueryInteger.select(cb1.sum(root1.get("grade")));
        Query<Integer> queryForSum = session.createQuery(criteriaQueryInteger);
        Integer sum  = queryForSum.getSingleResult();
        System.out.println(sum);
        
    
        
        
        
        
        
        
        
        
        
        
        
        
       
        


        
        
        
    
        tx.commit();
        session.close();
        sf.close();
		

	}

}
