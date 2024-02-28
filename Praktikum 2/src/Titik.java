/**
 * File           : Titik.java		21/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : Kelas yang berisi main dari Titik
 **/

public class Titik
{
    //Atribut
    private double absis, ordinat;
    static double counterTitik;

    //Konstruktor
    public Titik()
    {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double o)
    {
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    public void setAbsis (double a)
    {
        absis = a;
    }

    public void setOrdinat (double o)
    {
        ordinat = o;
    }

    public double getAbsis()
    {
        return absis;
    }

    public double getOrdinat()
    {
        return ordinat;
    }

    static double getCounterTitik()
    {
        return counterTitik;
    }

    public double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    public void refleksiX (Titik T){
        double ordinat = T.getOrdinat(); //atribut baru
        ordinat = ordinat*(-1);
        T.setOrdinat(ordinat);
    }
    public void refleksiY(Titik T){
        double absis = T.getAbsis();
        absis= absis*(-1);
        T.setAbsis(absis);
    }
    public void getRefleksiX (Titik T){
        refleksiX(T);
    }
    public void getRefleksiY (Titik T){
        refleksiY(T);
    }
}