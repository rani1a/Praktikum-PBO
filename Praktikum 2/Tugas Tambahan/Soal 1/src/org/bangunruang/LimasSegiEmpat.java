/**
 * File           : LimasSegiEmpat.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari LimasSegiEmpat
 **/
package org.bangunruang;
import org.bangundatar.SegiEmpat;
import org.bangundatar.SegitigaSamaSisi;

public class LimasSegiEmpat {
    //Atribut
    private SegiEmpat alasLimas;
    private SegitigaSamaSisi sisiTegak;

    //Konstruktor
    public LimasSegiEmpat(SegiEmpat alasLimas, SegitigaSamaSisi sisiTegak)
    {
        this.alasLimas = alasLimas;
        this.sisiTegak = sisiTegak;
    }

    //Method
    public SegiEmpat getAlasLimas() {
        return alasLimas;
    }

    public SegitigaSamaSisi getSisiTegak() {
        return sisiTegak;
    }

    public void setAlasLimas(SegiEmpat alasLimas) {
        this.alasLimas = alasLimas;
    }

    public void setSisiTegak(SegitigaSamaSisi sisiTegak) {
        this.sisiTegak = sisiTegak;
    }

    public double hitungTinggi(){
        double panjangAlas = getAlasLimas().getPanjangSisi();
        double panjangSisiTegak = getSisiTegak().getPanjangSisi();
        double tinggiLimas = Math.sqrt(Math.pow(panjangSisiTegak, 2) - Math.pow((panjangAlas / 2.0) * Math.sqrt(2), 2));
        return  tinggiLimas;
    }
    public double hitungVolume()
    {
        double luasAlas = getAlasLimas().hitungLuas();
        double tinggiSisiTegak = getSisiTegak().hitungTinggi();
        double tinggiLimas = hitungTinggi();
        return (1.0 / 3.0) * luasAlas * tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        double panjangSisi = getAlasLimas().getPanjangSisi();
        double lebarSisi = getAlasLimas().getLebarSisi();
        double tinggiSelimut = getSisiTegak().hitungTinggi();
        double luasAlas = panjangSisi * lebarSisi;
        double luasSisiTegak1 = 0.5 * panjangSisi * tinggiSelimut;
        double luasSisiTegak2 = 0.5 * lebarSisi * tinggiSelimut;
        return luasAlas + 2 * luasSisiTegak1 + 2 * luasSisiTegak2;
    }
}

