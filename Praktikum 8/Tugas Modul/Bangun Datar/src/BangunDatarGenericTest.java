/**
 * File : BangunDatarGenericTest.java  8/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Main class untuk generic bangun datar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Tipe generic: " + bdg.get().getClass().getName());
    }
}
