package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC", "root", "1234");
        Statement st = con.createStatement();

        // Isciler adinda bir tablo olusturunuz, id int, birim VARCHAR(10), maas int)

        String sorgu= "create table isciler(id int, birim varchar(10), maas int)";

        //cod calistirmak icin execute kullandik
/*
        st.execute(sorgu);
        System.out.println("isciler tablosu olusturuldu");


 */

        //isciler tablosunu siliniz

/*
        st.execute("drop table isciler");
        System.out.println("isciler tablosu silindi!!!");



 */
        //isciler tablosuna yeni bir sutun ekleyelim(isim varchar(20))

/*
        st.execute("alter table isciler add isim varchar(20)");
        System.out.println("Sutun eklendi");


 */

        //isciler tablosuna sutun ekle soyisim varchar(20), sehir varchar(10)
/*
        st.execute("alter table isciler add (soyisim varchar(20), sehir varchar(10))");
        System.out.println("2 Sutun eklendi");


 */
        //isciler tablosundaki sehir sutunun ismini ulke olarak degitirin
/*
        st.execute("alter table isciler rename column sehir to ulke");
        System.out.println("sutun ismi degistirildi");


 */



        //Tablonun ismini employee olarak degistirin

  /*
        st.execute("alter table isciler rename to employee");
        System.out.println("tablo ismi degistirildi");



   */





        //ulke sutunun data turunu varchar(30) yapin

        st.execute("alter table employee modify column ulke varchar(30)");
        System.out.println("varchar(30) yaptik");










    }
}
