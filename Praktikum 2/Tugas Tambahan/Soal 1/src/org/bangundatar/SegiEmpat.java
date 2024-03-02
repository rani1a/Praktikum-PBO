/**
 * File           : SegiEmpat.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari SegiEmpat
 **/
package org.bangundatar;
import org.poligon.Poligon;

public class SegiEmpat extends Poligon
{
    //Atribut
    private double panjangSisi;
    private double lebarSisi;

    //Konstruktor
    public SegiEmpat(double panjangSisi, double lebarSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
        this.lebarSisi = lebarSisi;
    }

    //Method
    public double getPanjangSisi()
    {
        return this.panjangSisi;
    }

    public double getLebarSisi()
    {
        return this.lebarSisi;
    }

    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public void setLebarSisi(double lebarSisi) {
        this.lebarSisi = lebarSisi;
    }

    public double hitungLuas()
    {
        double panjangSisi = getPanjangSisi();
        double lebarSisi = getLebarSisi();
        return panjangSisi * lebarSisi;
    }

    public double hitungKeliling() {
        double panjangSisi = getPanjangSisi();
        double lebarSisi = getLebarSisi();
        return 2 * (panjangSisi + lebarSisi);
    }
}
