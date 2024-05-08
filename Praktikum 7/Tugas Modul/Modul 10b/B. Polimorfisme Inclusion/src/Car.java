/**
 * File : Car.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class Car, turunan Class Vehicle
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}