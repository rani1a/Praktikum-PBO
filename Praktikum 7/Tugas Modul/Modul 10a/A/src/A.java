/**
 * File : A.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Jawaban soal 3a dari Modul 10a
 */

//  Polimorfisme Ad Hoc: Overloading
//  Polimorfisme Ad Hoc, juga dikenal sebagai overloading fungsi atau operator, adalah konsep dalam pemrograman
//  di mana sebuah kelas dapat memiliki beberapa metode dengan nama yang sama, tetapi dengan parameter yang
//  berbeda. Hal ini memungkinkan untuk melakukan tindakan yang berbeda tergantung pada tipe atau jumlah
//  parameter yang diberikan saat pemanggilan metode.

//  Syarat :
//  1. Metode yang di-overload harus memiliki nama yang sama.
//  2. Setiap metode overload harus memiliki parameter yang berbeda baik dalam jumlah, tipe, atau keduanya.
//  3. Metode-metode yang di-overload dapat memiliki tingkat aksesibilitas, misalnya, public, private, protected baik
//     yang berbeda atau sama.

//  Contoh:
public class A {
    public int jumlah(int a, int b) {
        return a + b;
    }
    public double jumlah(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        A penjumlahan = new A();
        // Memanggil metode jumlah dengan parameter integer
        int hasilInt = penjumlahan.jumlah(3, 5);
        System.out.println("Hasil penjumlahan integer: " + hasilInt);
        // Memanggil metode jumlah dengan parameter double
        double hasilDouble = penjumlahan.jumlah(4.9, 8.2);
        System.out.println("Hasil penjumlahan double: " + hasilDouble);
    }
}