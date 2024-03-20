/**
 * File : MLingkaran.java
 * Tanggal : 20/03/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;
class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran : ");
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan jejari "+ r +" satuan adalah "+ l.hitungLuas());
    }
}
