/**
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 29 Mei 2024
 * File : DiskonLambda.java
 * Deskripsi: Ekspresi lambda dasar, digunakan untuk menghitung diskon
 */
interface IDiskon {
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda ekspresi
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}

/**
 * Pertanyaan : Dapatkah anda membedakan antara bagamana diskonLebaran dan diskonBiasa diimplementasikan?
 * Jawab :
 * Perbedaan antara diskonLebaran dan diskonBiasa adalah:
 * - diskonLebaran diimplementasikan menggunakan methode ekspresi lambda sederhana tanpa menggunakan blok kode (kurung kurawal).
 * Bentuknya adalah: (harga) -> harga - (harga * 0.4);
 * - diskonBiasa diimplementasikan menggunakan methode ekspresi lambda dengan blok kode (kurung kurawal) dan menggunakan pernyataan return.
 * Bentuknya adalah:
 *   (harga) -> {
 *   return harga - (harga * 0.1);
 *   };
 */
