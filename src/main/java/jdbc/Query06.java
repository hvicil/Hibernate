package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query06 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC", "root", "1234");
        Statement st = con.createStatement();




        // SORU: urunler tablosuna aşağıdaki verileri toplu bir şekilde etkileyin
        // Çok miktarda kayıt eklemek için PreparedStatement metodu kullanılır.
        // 1) Veri girişine uygun bir POJO (Plain Old Java Object) class oluşturulur
        // 2) POJO class ta nesneleri saklayacak bir collection oluşturulur
        // 3) Bir döngğü ile kayıtlar eklenir.
/*
        List<Urun> kayitlar = new ArrayList<>();

        kayitlar.add(new Urun(101, "Laptop", 6500));
        kayitlar.add(new Urun(102, "PC", 4500));
        kayitlar.add(new Urun(103, "Telefon", 4500));
        kayitlar.add(new Urun(104, "Anakart", 1500));
        kayitlar.add(new Urun(105, "Klavye", 200));
        kayitlar.add(new Urun(106, "Fare", 100));

        PreparedStatement tablo = con.prepareStatement("insert into urunler values(?,?,?)");

        for(Urun each:kayitlar){
            tablo.setInt(1, each.getId());
            tablo.setString(2, each.getIsim());
            tablo.setDouble(3, each.getFiyat());

            tablo.addBatch();
        }
        tablo.executeBatch();
        System.out.println("Veriler Eklendi");


 */
        //urunler tablsundaki pc'nin fiyatini %10 zam yapiniz

  /*
        int s1= st.executeUpdate("UPDATE urunler SET fiyat =fiyat*1.1 where isim='PC'" );

        System.out.println(s1+" fiyat guncellendi");


   */
        //Urunler tablosunda Marka adinda ve Default degeri Asus olan bir sutun ekleyin
/*
        int s2=st.executeUpdate("alter table urunler add MARKA varchar(20) Default 'ASUS'");
        System.out.println(s2+" sutun eklendi");


 */
/*
        st.execute("alter table urunler add Magaza varchar(20) Default 'Gold'");


 */
        st.execute("drop table urunler");
        System.out.println("Tablo Silindi");


    }






}
