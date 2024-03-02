/**
 * File           : Orang.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari Orang
 **/
package org.orang;
public class Orang {
    //Atribut
    protected String nama;
    protected String nik;
    //Konstruktor
    public Orang (String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }
    //Method
    public String getNama(){
        return nama;
    }
    public String getNik(){
        return nik;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
}
