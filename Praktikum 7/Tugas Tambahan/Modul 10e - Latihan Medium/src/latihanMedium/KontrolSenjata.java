/**
 * File : KontrolSenjata.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class KontrolSenjata
 */
package latihanMedium;

public class KontrolSenjata {
    protected Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }
    public void menembak(int jumlah) {
        System.out.println("Siap menembak " + jumlah + " kali");
        if (senjata.getPeluru() == 0) {
            System.out.println("Peluru Habis");
        }
        else if (jumlah > senjata.getPeluru()) {
            for (int i = 0; i < senjata.getPeluru(); i++) {
                System.out.println(senjata.getBunyi() + " ");
            }
            for (int i = 0; i < jumlah - senjata.getPeluru(); i++) {
                System.out.println("Gagal tembak, Peluru Habis");
            }
            senjata.setPeluru(0);
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
        else {
            for (int i = 0; i < jumlah; i++) {
                System.out.println(senjata.getBunyi() + " ");
            }
            senjata.setPeluru(senjata.getPeluru() - jumlah);
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
    }

    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb! ";
        }
        else {
            return "Gagal, belum pasang bayonet";
        }
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
