package hospital;

import java.sql.*;

public class Baglanti {

    public static ResultSet link(String sql) throws SQLException, ClassNotFoundException {

        //1-driver yukle

        Class.forName("com.mysql.cj.jdbc.Driver");

        //2-Baglanti Olusturma

        Connection con = DriverManager.getConnection

                ("jdbc:mysql://localhost:3306/hospital?serverTimezone=UTC", "root", "1234");

        //3-Statement

        Statement st = con.createStatement();

        return st.executeQuery(sql);

    }
}

