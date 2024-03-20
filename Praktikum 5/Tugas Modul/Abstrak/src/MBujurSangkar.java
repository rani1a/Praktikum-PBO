/**
 * File : MBujurSangkar.java
 * Tanggal : 20/03/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : kelas yang implementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;
class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}

/**
 * Pertanyaan :
 * Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi
 * metode abstrak yang ada pada kelas BangunDatar? Jelaskan!
 * Jawaban :
 * Dalam bahasa pemrograman Java, jika sebuah kelas turunan dari kelas abstrak tidak mengimplementasikan semua
 * metode abstrak dari kelas induknya, maka kelas turunan tersebut harus dideklarasikan sebagai kelas abstrak juga.
 * Jika tidak, maka akan terjadi kesalahan kompilasi.
 */

