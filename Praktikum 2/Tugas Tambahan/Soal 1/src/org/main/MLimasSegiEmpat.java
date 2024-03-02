/**
 * File           : MLimasSegiEmpat.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File main MLimasSegiEmpat
 **/

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MLimasSegiEmpat {
    public static void main(String[] args) {
        SegiEmpat segiEmpat = new SegiEmpat(6, 6);
        SegitigaSamaSisi segitigaSamaSisi= new SegitigaSamaSisi(6);
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(segiEmpat, segitigaSamaSisi);

        System.out.println("Panjang sisi segiempat: " + segiEmpat.getPanjangSisi());
        System.out.println("Lebar sisi segiempat: " + segiEmpat.getLebarSisi());
        System.out.println("Panjang sisi segitiga sama sisi: " + segitigaSamaSisi.getPanjangSisi());
        System.out.println("Tinggi segitiga sama sisi: " + segitigaSamaSisi.hitungTinggi());
        System.out.println("Tinggi limas segiempat: " + limasSegiEmpat.hitungTinggi() + "\n");
        System.out.println("Luas permukaan limas segiempat : " + limasSegiEmpat.hitungLuasPermukaan());
        System.out.println("Volume limas segiempat : " + limasSegiEmpat.hitungVolume());
    }
}


/*Kesimpulan :
Dalam penyelesaian tugas di atas, digunakan beberapa access modifier seperti private dan public
untuk mengatur aksesibilitas dari atribut, konstruktor, dan metode dalam class. Penggunaan access
modifier private digunakan untuk membatasi akses langsung ke atribut-atribut tertentu dari luar kelas,
sehingga hanya dapat diakses melalui metode-metode yang telah ditentukan. Sementara itu, access
modifier public digunakan untuk membuat atribut atau metode dapat diakses dari luar kelas.
Penggunaan access modifier yang tepat membantu dalam menerapkan prinsip enkapsulasi, di mana detail
implementasi dari suatu kelas dapat disembunyikan dan hanya interaksi yang diizinkan yang dapat dilakukan.

Dalam hal relasi antar objek, terdapat hubungan agregasi antara kelas LimasSegiEmpat dengan kelas
SegiEmpat dan SegitigaSamaSisi. Agregasi adalah tipe relasi di mana sebuah objek atau kelas memiliki
referensi ke objek lain, namun objek tersebut tidak sepenuhnya bergantung pada objek lain tersebut.
Dalam tugas ini, objek LimasSegiEmpat menggunakan objek SegiEmpat dan SegitigaSamaSisi,
tetapi keduanya dapat digunakan secara terpisah dan tidak tergantung pada keberadaan objek LimasSegiEmpat.
Jika objek LimasSegiEmpat dihapus, objek SegiEmpat dan SegitigaSamaSisi akan tetap ada dan dapat digunakan
dalam konteks lain.

Selain itu, terdapat pewarisan (inheritance) dari kelas Poligon ke kelas SegiEmpat dan SegitigaSamaSisi.
Artinya, SegiEmpat dan SegitigaSamaSisi adalah anak (subclass) dari kelas Poligon, sementara Poligon
adalah induk (superclass)-nya. Ini menunjukkan hubungan "is-a", di mana segitiga dan segiempat adalah
jenis dari poligon. Dengan menerapkan pewarisan, kelas anak (SegiEmpat dan SegitigaSamaSisi) mewarisi
atribut dan metode dari kelas induk (Poligon), dan dapat menambahkan perilaku khusus atau mengganti
perilaku yang ada sesuai kebutuhan mereka.
*/