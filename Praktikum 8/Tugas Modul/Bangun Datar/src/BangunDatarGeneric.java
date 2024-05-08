/**
 * File : BangunDatarGeneric.java  8/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Kelas konstruksi generic untuk BangunDatar
 */
public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;
    public void set (T1 tipeBangunDatar) {//tuple

        bangunDatar = tipeBangunDatar;
    }
    public T1 get() {
        return bangunDatar;
    }
    public double hitungKeliling (){
        return bangunDatar.hitungKeliling();
    }
}

/*Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java dengan karakter yang lain seperti, T1,T2,T1234.
 Berilah simpulkan dari apa yang anda lakukan!

 Jawab :
 Pada kode di atas, 'T' digunakan sebagai tipe generik dalam kelas BangunDatarGeneric. Tipe generik ini memungkinkan
 kelas untuk menerima tipe data generik yang merupakan subclass dari kelas BangunDatar.
 Dengan mengganti 'T' dengan karakter lain, seperti 'T1', 'T2', atau 'T1234', secara fundamental tidak akan
 mengubah fungsionalitas kelas.
 Mengubah 'T' menjadi 'T1', 'T2', atau 'T1234' hanya akan mengubah nama variabel dalam kelas BangunDatarGeneric.
 Secara fungsional, kelas tetap bekerja dengan cara yang sama dan kompatibel dengan berbagai jenis bangun datar.
 */