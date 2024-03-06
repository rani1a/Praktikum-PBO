/**
 * File: AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 6 Maret 2024
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}