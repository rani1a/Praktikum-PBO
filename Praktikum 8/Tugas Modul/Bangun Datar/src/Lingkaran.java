/**
 * File : Lingkaran.java  8/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */
public class Lingkaran extends BangunDatar {
    private double jejari;
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}