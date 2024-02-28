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
