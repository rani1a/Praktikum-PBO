/**
 * File           : KeranjangBelanja.java		09/03/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : File yang berisi class dari Keranjang Belanja mengenai Asersi
 **/
public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        assert (count < keranjang.length): "Keranjang sudah penuh";
        this.keranjang[count] = item;
        count = count + 1;
    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}

