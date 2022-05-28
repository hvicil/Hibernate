package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Query33 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ResultSet veri2 = Connect.link("select * from ogrenciler where sinif =9 and cinsiyet ='K'");

        Connect.yazdir(veri2);


    }
}
