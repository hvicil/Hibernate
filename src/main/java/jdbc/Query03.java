package jdbc;

import java.sql.*;

public class Query03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC", "root", "1234");
        Statement st = con.createStatement();

        ResultSet tablo1 = st.executeQuery("select * from bolumler");

        System.err.printf("%-8s %-16s %-8s\n", "Bolum ID", "Birim", "Sehir");
        System.out.println("======== ============== ========  =======");

        while (tablo1.next()) {


            System.out.printf("%-8s %-16s %-8s\n", tablo1.getInt(1), tablo1.getString(2),
                    tablo1.getString(3));

        }

            System.err.println("======== ============== ========  =======");



            ResultSet tablo2 = st.executeQuery("select personel_isim, maas from personel where bolum_id in (10,30) order by maas desc");

            while (tablo2.next()) {


                System.out.printf("%-8s %-16s\n", tablo2.getString(1), tablo2.getInt(2));


            }

        System.out.println("*************************");
        System.out.printf("%-16s %-16s %-8s\n", "Personel Ismi", "Bolum Ismi", "Maas");


            ResultSet tablo3=st.executeQuery("select p.personel_isim, b.bolum_isim, p.maas " +
                    "" +
                    "from bolumler b left join personel p on b.bolum_id=p.bolum_id order by b.bolum_isim, p.maas");

        while (tablo3.next()) {


            System.out.printf("%-16s %-16s %-8s\n", tablo3.getString(1), tablo3.getString(2), tablo3.getInt(3));


        }


        System.out.println("*************************");
        System.out.printf("%-16s %-16s %-8s\n", "Bolum Ismi", "Personel Ismi", "Maas");


        ResultSet tablo4=st.executeQuery("select p.personel_isim, b.bolum_isim, p.maas \" +\n" +
                "        \"\" +\n" +
                "        \"from bolumler b left join personel p on b.bolum_id=p.bolum_id order by maas desc limit 10");

        while (tablo4.next()) {


            System.out.printf("%-16s %-16s %-8s\n", tablo4.getString(2), tablo4.getString(1), tablo4.getInt(3));


        }








        }
    }
