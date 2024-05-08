/**
 * File : Pegawai.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class Pegawai
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai (String nama){
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData(){
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
