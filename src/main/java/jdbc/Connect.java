package jdbc;

import java.sql.*;

public class Connect {

    public static ResultSet link(String sql) throws SQLException, ClassNotFoundException {

        //1-driver yukle

        Class.forName("com.mysql.cj.jdbc.Driver");

        //2-Baglanti Olusturma

        Connection con = DriverManager.getConnection

                ("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "1234");

        //3-Statement

        Statement st = con.createStatement();

        return st.executeQuery(sql);
    }

    public static void yazdir(ResultSet veri) throws SQLException {

        System.err.printf("%-8s %-16s %-8s %-8s\n", "Okul No", "Ogrenci Isim", "Sinif", "Cinsiyet");
        System.out.println("======== ============== ========  =======");

        //5
        while (veri.next()) {


            System.out.printf("%-8s %-16s %-8s %-8s\n", veri.getInt(1), veri.getString(2),
                    veri.getString(3), veri.getString(4));


        }



    }

}
