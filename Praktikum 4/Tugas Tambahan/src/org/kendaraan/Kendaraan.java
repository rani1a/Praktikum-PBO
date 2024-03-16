/**
 * File : Kendaraan.java  16/03/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Representasi dasar dari objek kendaraan
 */
package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama) {
        this.nama = nama;
        this.kecepatan = 0;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getKecepatan() {
        return kecepatan;
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Kecepatan: " + getKecepatan() + " km/h");
    }
    public void gas(int kecepatan, int durasi) {
        System.out.println("Kecepatan sekarang: " + this.kecepatan + " km/h");
        int kecepatanAkhir = this.kecepatan + kecepatan;
        this.kecepatan = kecepatanAkhir;
        System.out.println("Kecepatan setelah " + durasi + " detik: " + this.kecepatan + " km/h");
    }
    public void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan berhenti.");
    }
    public void klakson() {
        System.out.println("Kendaraan " + nama + " berbunyi.");
    }
}
