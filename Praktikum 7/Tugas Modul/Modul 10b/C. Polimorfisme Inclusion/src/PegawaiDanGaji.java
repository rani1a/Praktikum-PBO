/**
 * File : PegawaiDanGaji.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class main PegawaiDanGaji
 */
public class PegawaiDanGaji {
    public static void main(String args[]){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
