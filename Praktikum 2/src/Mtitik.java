/**
 * File           : Mtitik.java		28/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : Main dari Titik
 **/


class Mtitik
{
    //Atribut
    static double counterTitik;

    //Algoritma
    public static void main(String[] args)
    {
        Titik t1,t2,t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("Jumlah objek titik: " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        System.out.println("Jarak titik t1 dengan pusat " + t1.getJarakPusat());
        System.out.println("Titik t1 sebelum refleksi terhadap X = (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t1.refleksiX(t1);
        System.out.println("Titik t1 setelah refleksi terhadap X = (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        System.out.println("Titik t1 sebelum refleksi terhadap Y= (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t1.refleksiY(t1);
        System.out.println("Titik t1 setelah refleksi terhadap Y = (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
    }
}

/*
Kesimpulan : Jika kita merubah acces modifier pada atribut menjadi public maka nilai atribut bisa menjadi tidak konsisten,
maka dari itu sebaiknya atribut diset private supaya hanya diakses oleh class itu sendiri. Untuk konstruktor harus
diset public supaya bisa untuk membuat objek di luar class. Sedangkan, untuk method sebaiknya di set public supaya bisa
dipanggil. Misalnya, method refleksiX dan refleksiY harus di set public supaya bisa dipanggil di class lain yaitu di class
main.
 */
