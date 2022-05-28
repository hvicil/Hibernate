package com.hb04.onetomany;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {
	public static void main(String[] args) {
        Student04 student1 = new Student04();
        Book04 book1 = new Book04();
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
                .addAnnotatedClass(Book04.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        // Id'si verilen bir ��rencinin kitaplar�n� get methodu ile ald�k.
//      student1=session.get(Student04.class, 1001);
//      for (Book04 book : student1.getBookList()) {
//          System.out.println(book);
//      }
        // id'si verilen bir kitab�n ��rencisine eri�ildi.
//      book1= session.get(Book04.class, 101);
//      System.out.println(book1.getStudent().getName());
        // SQL kullanarak inner join
//      String sqlQuery1="SELECT s.std_name,b.name from student04 s "
//              + "INNER JOIN book04 b ON s.id=b.student_id";
//      
//      List<Object []> resultList1= session.createSQLQuery(sqlQuery1).getResultList();
//      
//      for (Object[] r : resultList1) {
//          System.out.println(Arrays.toString(r));
//      }
        // HQL kullanarak inner join
//      String hqlQuery1="SELECT s.name,b.name FROM Student04 s "
//              + "INNER JOIN FETCH Book04 b ON s.id= b.student";
//      
//      List<Object []> resultList2= session.createQuery(hqlQuery1).getResultList();
//      for (Object[] r : resultList2) {
//          System.out.println(Arrays.toString(r));
//      }   
//      for (Object[] r : resultList2) {
//          System.out.println(r[0] +"-"+r[1] );
//      }
     String hqlQuery2="SELECT s.name,b.name FROM Student04 s "
     + "LEFT JOIN FETCH Book04 b ON s.id= b.student";
     List<Object []> resultList3= session.createQuery(hqlQuery2).getResultList();
      for (Object[] r : resultList3) {
         System.out.println(Arrays.toString(r));
      }
//      String hqlQuery3 = "SELECT s.name,b.name FROM Student04 s " +
//      "RIGHT JOIN FETCH Book04 b ON s.id= b.student";
//
//      List<Object[]> resultList4 = session.createQuery(hqlQuery3).getResultList();
//      for (Object[] r : resultList4) {
//          System.out.println(Arrays.toString(r));
	// SQL sorgusu ile t�m kay�tlar� silme
//      String sqlQuery2="DELETE FROM book04";
//      int numOfRec1 = session.createSQLQuery(sqlQuery2).executeUpdate();
//      System.out.println("Effected row count:"+numOfRec1);

	// HQL ile t�m kay�tlar� silme i�lemi
//        String hqlQuery4="DELETE FROM Book04";
//        int numOfRec2=session.createQuery(hqlQuery4).executeUpdate();
//        System.out.println("Effected row count:"+numOfRec2);
//      student1 = session.get(Student04.class, 1002);
//        session.delete(student1);

//        book1 = session.get(Book04.class, 103);
//        session.delete(book1);
//        


	tx.commit();

	session.close();sf.close();
}

}
