/**
 * File : Manager.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class Manager, turunan Class Pegawai
 */

public class Manager extends Pegawai{
    private int tunjangan = 700000;

    public Manager(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama : " + super.getNama() +", "+ "Gaji Pokok: " + super.getGajiPokok());
        System.out.println("Tunjangan : " + tunjangan);
    }
}
