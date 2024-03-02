/**
 * File           : WaliMahasiswa.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari Wali Mahasiswa
 **/
package org.walimahasiswa;
import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    //Atribut
    private String nomorHp;
    private String alamat;

    //Konstruktor
    public WaliMahasiswa (String nama, String nik, String nomorHp, String alamat){
        super(nama, nik);
        this.nama = nama;
        this.nik = nik;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    //Method
    public String getNomorHp(){
        return nomorHp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNomorHp (String nomorHp){
        this.nomorHp = nomorHp;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
