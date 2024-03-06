/**
 * File: AngkaSial.java
 * Deskripsi: Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Nama Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 6 Maret 2024
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+ "bukan angka sial");
    }
    public static void main (String[]args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**
 *Pertanyaan 1 :
 *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 *
 *Jawaban :
 *Baris 12 akan dieksekusi terlebih dahulu karena pada saat (angka==10), kondisi if akan bernilai false,
 *maka akan langsung mencetak "10 bukan angka sial". Selanjutnya, jika eksepsi terjadi pada
 *baris 6 (angka == 13) dan eksepsi dilemparkan dengan menggunakan perintah "throw", program akan
 *langsung keluar dari metode "cobaAngka" dan baris 12 tidak akan dieksekusi, kemudian eksepsi akan ditangkap di blok
 *catch yang akan mencetap pesan yaitu "hati-hati memasukkan angka!!!".
 *
 * Pertanyaan 2 :
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 *
 * Jawaban :
 * Ya, Baris 21 akan dieksekusi ketika terjadi eksepsi (as.cobaAngka(13); yang berada di dalam blok try) dan eksepsi
 * dilemparkan dengan menggunakan perintah "throw", program akan langsung keluar dari metode "cobaAngka",
 * kemudian eksepsi akan ditangkap di blok catch pada method "main" yang akan mencetap pesan
 * yaitu "hati-hati memasukkan angka!!!".
 */