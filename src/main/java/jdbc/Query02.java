package jdbc;

import java.sql.*;

public class Query02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2
        Connection con = DriverManager.getConnection

                ("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "1234");

        //3

        Statement st = con.createStatement();

        //4


        ResultSet veri = st.executeQuery("select * from ogrenciler where cinsiyet = 'E'");

        System.err.printf("%-8s %-16s %-8s %-8s\n", "Okul No", "Ogrenci Isim", "Sinif", "Cinsiyet");
        System.out.println("======== ============== ========  =======");

        //5
        while (veri.next()) {


            System.out.printf("%-8s %-16s %-8s %-8s\n", veri.getInt(1), veri.getString(2),
                    veri.getString(3), veri.getString(4));


        }


        /*
        Soru 3
         */




        //6

        con.close();
        st.close();
        veri.close();



    }

}
