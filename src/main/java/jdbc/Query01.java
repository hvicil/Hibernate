package jdbc;

import java.sql.*;

public class Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1-driver yukle

        Class.forName("com.mysql.cj.jdbc.Driver");

        //2-Baglanti Olusturma

        Connection con = DriverManager.getConnection

                ("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "1234");

        //3-Statement

        Statement st = con.createStatement();

        //4-ResultSet


        ResultSet veri = st.executeQuery("select * from ogrenciler");


        //5-Sonuckari yazdir

        System.err.printf("%-8s %-16s %-8s %-8s\n", "Okul No", "Ogrenci Isim", "Sinif", "Cinsiyet");
        System.out.println("======== ============== ========  =======");

        while (veri.next()) {


            System.out.printf("%-8s %-16s %-8s %-8s\n", veri.getInt(1), veri.getString(2),
                    veri.getString(3), veri.getString(4));


        }
        //6-Kapatma

        con.close();
        st.close();
        veri.close();


    }
}
