/**
 * File           : Anggota.java		09/03/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari Anggota
 **/
public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Anda telah mencapai batas maksimal peminjaman buku");
        }
        if (!buku.isTersedia()) {
            throw new MaksimumBukuTerpinjamException("Buku tidak tersedia untuk dipinjam");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }

}