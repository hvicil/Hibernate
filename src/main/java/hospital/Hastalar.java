package hospital;

import java.sql.SQLException;

public class Hastalar {

    static void hastaEkle(String ad, int yas, String sehir, String cinsiyet, String sikayet) throws SQLException, ClassNotFoundException {

        String s = ad + ", " + yas + ", " + sehir + ", " + cinsiyet + ", " + sikayet;

        Baglanti.link("insert into hastalar values(ad, yas, sehir, cinsiyet, sikayet)");


    }

    /*
    static void hastaGuncelle(int id, String ad, int yas, String sehir, String cinsiyet, String sikayet) throws SQLException, ClassNotFoundException {

        if(id=100){

        }

    }

    static void hastaListele() {

    }

     */


}
