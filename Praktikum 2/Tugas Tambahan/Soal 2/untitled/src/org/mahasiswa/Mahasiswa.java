/**
 * File           : Mahasiswa.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari Mahasiswa
 **/
package org.mahasiswa;
import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang {
    //Atribut
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    //Konstruktor
    public Mahasiswa (String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    //Method
    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.out.println("\nMahasiswa:");
        System.out.println("    Nama Mahasiswa: " + getNama());
        System.out.println("    NIK Mahasiswa: " + getNik());
        System.out.println("    NIM Mahasiswa: " + getNim());
        System.out.println("    Jurusan Mahasiswa: " + getJurusan());
        System.out.println("    Wali Mahasiswa:");
        System.out.println("        Nama Wali: " + wali.getNama());
        System.out.println("        NIK Wali: " + wali.getNik());
        System.out.println("        Nomor HP Wali: " + wali.getNomorHp());
        System.out.println("        Alamat Wali: " + wali.getAlamat());
    }

}
