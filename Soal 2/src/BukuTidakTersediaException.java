/**
 * File           : BukuTidakTersediaException.java		09/03/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari Buku Tidak Tersedia Exception yang merupakan sebuah
 *                  Eksepsi
 **/
public class BukuTidakTersediaException extends Exception{
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}