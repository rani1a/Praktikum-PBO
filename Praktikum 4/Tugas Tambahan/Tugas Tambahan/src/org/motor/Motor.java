package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int cc;


    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }
    public int getCC() {
        return cc;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Motor");
        System.out.println("Kapasitas mesin cc: " + cc);
    }

    public double hitungHorsepower(int angka) {
        if (angka >= 15 && angka <= 17) {
            double horsepower = cc * 1.0 / angka;
            return horsepower;
        } else {
            System.out.println("Angka harus berada di antara 15 dan 17");
            return -1;
        }
    }

    @Override
    public void klakson() {
        System.out.println(super.getNama() + " berbunyi, Womp Womp!");
    }
}
