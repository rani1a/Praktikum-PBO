/**
 * File           : SegitigaSamaSisi.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari SegitigaSamaSisi
 **/

package org.bangundatar;
import org.poligon.Poligon;
public class SegitigaSamaSisi extends Poligon{
    //Atribut
    private double panjangSisi;

    //Konstruktor
    public SegitigaSamaSisi(double panjangSisi)
    {
        this.jumlahSisi = 3;
        this.panjangSisi = panjangSisi;
    }

    //Method
    public double getPanjangSisi()
    {
        return this.panjangSisi;
    }
    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public double hitungTinggi()
    {
        double panjangSisi = getPanjangSisi();
        double tinggiSegitigaTegak = Math.sqrt(Math.pow(panjangSisi, 2) - Math.pow(panjangSisi/ 2.0, 2));
        return tinggiSegitigaTegak;
    }
    public double hitungLuas()
    {
        double panjangSisi = getPanjangSisi();
        double tinggi = hitungTinggi();
        return (panjangSisi * tinggi)/2;
    }
}
