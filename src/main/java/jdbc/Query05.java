package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC", "root", "1234");
        Statement st = con.createStatement();

        // Bolumler tablsunda yeni bir kayit
/*
        int s1 = st.executeUpdate("insert into bolumler values(80,'ARGE','ISTANBUL')");
        System.out.println(s1 + "Satir Eklendi");


 */
        /*
        String [] veri1 = {"insert into bolumler values(85,'ARGE','ISTANBUL')",
                "insert into bolumler values(90,'YEMEK','BURSA')",
                "insert into bolumler values(100,'MUHASEBE','ANKARA')"};

        int count = 0;
        for (String each:veri1
             ) {

            count=count + st.executeUpdate(each);

        }

        System.out.println(count+" veri girisi yapildi");



         */

        /*
        String [] veri2 = {"insert into bolumler values(101,'ARGE','ISTANBUL')",
                "insert into bolumler values(102,'YEMEK','BURSA')",
                "insert into bolumler values(103,'MUHASEBE','ANKARA')"};

        for (String each:veri2
             ) {
            st.addBatch(each);
        }
        st.executeBatch();

        System.out.println("Veriler Database'e Eklendi");


         */

        String [] veri3 = {"insert into bolumler values(200,'ARGE','ISTANBUL')",
                "insert into bolumler values(201,'YEMEK','BURSA')",
                "insert into bolumler values(202,'MUHASEBE','ANKARA')"};

        for (String each:veri3
        ) {
            st.addBatch(each);
        }
        st.executeBatch();

        System.out.println("Veri3 Database'e Eklendi");


    }
}
