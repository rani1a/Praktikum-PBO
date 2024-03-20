/**
 * File : BangunDatar.java
 * Tanggal : 20/03/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 */
public abstract class BangunDatar {
    protected double luas;

    public abstract  double hitungLuas (double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
