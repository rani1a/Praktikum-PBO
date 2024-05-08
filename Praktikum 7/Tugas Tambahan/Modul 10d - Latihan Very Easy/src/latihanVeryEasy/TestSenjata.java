/**
 * File : TestSenjata.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class main TestSenjata
 */

package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah peluru AK47: "+ ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
