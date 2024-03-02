/**
 * File           : Main.java		29/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File main
 **/
package org.main;
import org.mahasiswa.*;
import org.orang.Orang;
import org.walimahasiswa.*;

public class Main {
    public static void main(String[] args) {
        //membuat objek
        WaliMahasiswa waliMahasiswa1 = new WaliMahasiswa("a", "b", "c","d");
        //mengatur nilai atribut dengan menggunakan set
        waliMahasiswa1.setNama("Park Hyung Sik");
        waliMahasiswa1.setNik("2233445566778899");
        waliMahasiswa1.setNomorHp("087654321098");
        waliMahasiswa1.setAlamat("Jl. Mawar No. 789");
        //membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa("a","b","c","d", waliMahasiswa1);
        //mengatur nilai atribut dengan menggunakan set
        mahasiswa1.setNama("Ryeo Un");
        mahasiswa1.setNik("9876543210987654");
        mahasiswa1.setNim("24060122120014");
        mahasiswa1.setJurusan("Teknik Elektro");
        mahasiswa1.setWali(waliMahasiswa1);

        System.out.println("\nInformasi mahasiswa dan wali mahasiswa dari mahasiswa tersebut:");
        mahasiswa1.cetak();
    }
}

/*
Kesimpulan :
Dalam penyelesaian tugas ini, digunakan beberapa access modifier seperti private dan public untuk mengatur aksesibilitas
dari atribut, konstruktor, dan metode dalam class. Access modifier private digunakan untuk membatasi akses langsung ke
atribut-atribut tertentu dari luar kelas, sementara access modifier public digunakan untuk membuat atribut atau metode
dapat diakses dari luar kelas. Penggunaan access modifier yang tepat membantu dalam menerapkan prinsip enkapsulasi, di mana
detail implementasi dari suatu kelas dapat disembunyikan dan hanya interaksi yang diizinkan yang dapat dilakukan.

Dalam hal relasi antar objek, terdapat hubungan pewarisan (inheritance) dari kelas Orang ke kelas Mahasiswa dan WaliMahasiswa.
Mahasiswa dan WaliMahasiswa adalah anak (subclass) dari kelas Orang, sementara Orang adalah induk (superclass)-nya. Ini menunjukkan
hubungan "is-a", di mana mahasiswa dan wali mahasiswa adalah jenis dari orang. Dengan menerapkan pewarisan, kelas anak (Mahasiswa
dan WaliMahasiswa) mewarisi atribut dan metode dari kelas induk (Orang), dan dapat menambahkan perilaku khusus atau mengganti
perilaku yang ada sesuai kebutuhan mereka.

Selain itu, terdapat hubungan agregasi antara kelas Mahasiswa dengan kelas WaliMahasiswa. Agregasi adalah tipe relasi di mana 
sebuah objek atau kelas memilikireferensi ke objek lain, namun objek tersebut tidak sepenuhnya bergantung pada objek lain tersebut.
Dalam tugas ini, objek Mahasiswa menggunakan objek WaliMahasiswa sebagai atribut wali, yang menunjukkan bahwa wali mahasiswa 
adalah bagian dari mahasiswa.
*/
