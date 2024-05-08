/*
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 8 Mei 2024
 * File : Data.java
 * Deskripsi : Class generik yang digunakan untuk menyimpan suatu objek dengan tipe data generik.
 */
public class Data<T> {
    private T isi;

    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}