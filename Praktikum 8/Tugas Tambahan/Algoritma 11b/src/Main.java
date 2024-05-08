/*
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 8 Mei 2024
 * File : Data.java
 * Deskripsi : Main class untuk generic
 */
public class Main {
    public static void main(String[] args) {
        Ulat K;
        Data<Kupu> anu;

        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}