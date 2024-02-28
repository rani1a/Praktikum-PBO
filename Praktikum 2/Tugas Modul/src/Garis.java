/**
 * File           : Garis.java		28/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : Class dari Garis
 **/

public class Garis {
    private Titik titikAwal, titikAkhir;
    public Garis(Titik titikAwal, Titik titikAkhir)
    {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }
    public Titik getTitikAwal ()
    {
         return titikAwal;
    }
    public void setTitikAwal (Titik titik)
    {
        this.titikAwal = titik;
    }
    public Titik getTitikAkhir ()
    {
        return titikAkhir;
    }
    public void setTitikAkhir (Titik titik)
    {
        this.titikAkhir = titik;
    }


}
