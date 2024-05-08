/**
 * File : Programmer.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class Programmer, turunan Class Pegawai
 */

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        super(nama);
    }
    
    public void tampilData(){
        System.out.println("Nama : " + super.getNama() + ", "+ "Gaji Pokok: " + super.getGajiPokok());
        System.out.println("Bonus : " + bonus);
    }
}
