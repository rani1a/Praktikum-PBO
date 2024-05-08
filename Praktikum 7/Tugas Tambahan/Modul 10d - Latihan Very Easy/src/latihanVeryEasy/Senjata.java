/**
 * File : Senjata.java  6/05/2024
 * Penulis : Rania
 * NIM : 24060122120013
 * Deskripsi : Class Senjata
 */

package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata (String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return peluru;
    }
    public void menembak (){
        System.out.print(getBunyi() + " ");
        peluru -= 1;
        System.out.println("\nSisa Peluru: " + peluru);
        System.out.println("");
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
