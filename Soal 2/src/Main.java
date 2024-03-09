/**
 * File           : Main.java		09/03/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File Main
 **/
public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Rania");
        Buku buku1 = new Buku("Sisi Tergelap Surga");
        Buku buku2 = new Buku("Happy Place");
        Buku buku3 = new Buku("Filosofi Teras");
        Buku buku4 = new Buku("Atomic Habits");

        buku1.setTersedia(true);
        buku2.setTersedia(true);
        buku3.setTersedia(true);
        buku4.setTersedia(true);

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
            System.out.println("Buku berhasil dipinjam.");
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Gagal melakukan peminjaman: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Gagal melakukan peminjaman: " + e.getMessage());
        }
    }
}