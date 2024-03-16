/**
 * File : Truk.java  16/03/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Representasi dari objek truk, turunan kelas kendaraan
 */
package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }
    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }
    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }
    public int getBeratMuatan() {
        return beratMuatan;
    }
    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Truk");
        System.out.println("Kapasitas muatan: " + kapasitasMuatan);
        System.out.println("Berat muatan: " + beratMuatan);

    }
    public void muatBarang(int berat) {
        if (beratMuatan + berat > kapasitasMuatan) {
            System.out.println("Muatan melebihi kapasitas! Tidak dapat dimuat.");
        } else {
            beratMuatan += berat;
            System.out.println("Barang seberat " + berat + " kg dimuat. Berat muatan saat ini: " + beratMuatan + " kg");
        }
    }
    @Override
    public void klakson() {
        System.out.println(super.getNama() + " berbunyi, Honk Honk!");
    }
}
