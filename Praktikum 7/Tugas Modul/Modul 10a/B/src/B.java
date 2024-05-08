/**
 * File : B.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Jawaban soal 3b dari Modul 10a
 */
public class B {
    public static void main(String[] args) {
        // Nomor 1
        // Output : 97
        // Berhasil dieksekusi
        // Coercion karena java secara implisit akan mengonversi
        // karakter 'a' ke nilai ASCII-nya, yaitu 97 yang selanjutnya akan disimpan sebagai tipe data integer.
         int output = 'a';
         System.out.println(output);

        // Nomor 2
        // Output : error (java: incompatible types: possible lossy conversion from double to int.)
        // Gagal dieksekusi
        // Casting dari tipe data double ke tipe data int.
        // Namun, hal tersebut gagal karena tipe data double memiliki presisi yang lebih tinggi daripada tipe data int.
        // Jadi, ada potensi kehilangan data saat mengonversi dari double ke int.
        // Code yang benar:
        //      double x = 15.5;
        //      int output = (int) x;
        // Jadi perlu menggunakan casting eksplisit.
        double x = 15.5;
        int output1 = x;
        System.out.println(output1);

        // Nomor 3
        // Output : 25.0
        // Berhasil dieksekusi.
        // Coercion terjadi ketika mengonversi nilai dari tipe data yang lebih
        // kecil ke tipe data yang lebih besar tanpa kehilangan presisi atau kehilangan data.
        // Nilai dari y yang bertipe int akan secara implisit dikonversi menjadi double.
        int y = 25;
        double output2 = y;
        System.out.println(output2);

        // Nomor 4
        // Output : N
        // Berhasil dieksekusi.
        // Casting karena secara eksplisit melakukan casting dari tipe data integer ke tipe data
        // char dengan menggunakan (char).
        // Mengonversi nilai ASCII yang sesuai dengan nilai integer tersebut ke karakter
        // yang sesuai dalam tabel ASCII. Dalam tabel ASCII, 78 mewakili huruf 'N'
        int z = 78;
        char output3 = (char) z;
        System.out.println(output3);

        // Nomor 5
        // Output : 97.0
        // Berhasil dieksekusi.
        // Coercion karena java secara implisit akan mengonversi
        // karakter 'a' ke nilai ASCII-nya, yaitu 97 yang selanjutnya akan disimpan sebagai tipe data double.
        char a = 'a';
        double output4= a;
        System.out.println(output4);
    }
}