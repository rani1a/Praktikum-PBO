/**
 * File           : MGaris.java		28/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : Main dari Garis
 **/

public class MGaris {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(0, 0);
        Titik titikAkhir = new Titik(3, 4);
        Garis garis1 = new Garis(titikAwal, titikAkhir);

        System.out.println("Titik Awal: (" + garis1.getTitikAwal().getAbsis() + ", " + garis1.getTitikAwal().getOrdinat()+ ")");
        System.out.println("Titik Akhir: (" + garis1.getTitikAkhir().getAbsis() + ", " + garis1.getTitikAkhir().getOrdinat() + ")");
    }
}
/*
Kesimpulan : Jika kita merubah acces modifier pada atribut menjadi public maka nilai atribut bisa menjadi tidak konsisten,
maka dari itu sebaiknya atribut diset private supaya hanya diakses oleh class itu sendiri. Untuk konstruktor harus
diset public supaya bisa untuk membuat objek di luar class. Sedangkan, untuk method sebaiknya di set public supaya bisa
dipanggil. Misalnya, method refleksiX dan refleksiY harus di set public supaya bisa dipanggil di class lain yaitu di class
main.
 */
