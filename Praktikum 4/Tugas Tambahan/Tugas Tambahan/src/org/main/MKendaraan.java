package org.main;

import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.motor.Motor;
import org.truk.Truk;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Yedam");
        System.out.println("\n===== Informasi Kendaraan =====");
        kendaraan.cetakInfo();
        kendaraan.gas(50, 3);
        kendaraan.berhenti();
        kendaraan.klakson();

        Mobil mobil = new Mobil("HR-V", 4);
        System.out.println("\n===== Informasi Mobil =====");
        mobil.cetakInfo();
        mobil.bukaPintu(1);
        mobil.klakson();

        Motor motor = new Motor("Grand Filano", 125);
        System.out.println("\n===== Informasi Motor =====");
        motor.cetakInfo();
        System.out.println("Perkiraan Tenaga Motor:");
        System.out.println("  - " + motor.hitungHorsepower(16) + " HP, dengan batas bawah " + motor.hitungHorsepower(15) + " dan batas atas " + motor.hitungHorsepower(17));
        motor.klakson();

        Truk truk = new Truk("Isuzu ELF (N Series) 6 Wheel", 40);
        System.out.println("\n===== Informasi Truk =====");
        truk.cetakInfo();
        truk.muatBarang(15000);
        truk.klakson();
    }
}
