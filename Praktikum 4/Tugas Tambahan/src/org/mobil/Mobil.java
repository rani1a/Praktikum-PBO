/**
 * File : Mobil.java  16/03/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Representasi dari objek mobil, turunan kelas kendaraan
 */
package org.mobil;
import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Mobil");
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }

    public void bukaPintu(int nomorPintu) {
        if (nomorPintu <= getJumlahPintu()) {
            System.out.println("Pintu nomor " + nomorPintu + " di mobil telah terbuka.");
        } else {
            System.out.println("Tidak ada pintu ke" + nomorPintu + "pada mobil.");
        }
    }

    public void klakson() {
        System.out.println(super.getNama() + " berbunyi, Vroom Vroom!");
    }
}
