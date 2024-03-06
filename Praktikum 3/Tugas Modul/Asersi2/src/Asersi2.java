/**
 * File : Asersi2.java
 * Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Nama Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 6 Maret 2024
 */

//class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * Pertanyaan :
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 *
 * Jawaban : Tidak ada kesalahan secara konsep dalam program Asersi2 di atas, hanya terdapat kekurangan
 * dalam pesan yang akan dicetak, yang sebaiknya diubah jadi "jari-jari tidak boleh kurang dari atau sama dengan 0"
 *
 **/
