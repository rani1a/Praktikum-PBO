import java.util.ArrayList;
/**
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 29 Mei 2024
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method.
 */

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        //dengan lambda ekspresi
        mahasiswaList.forEach((nama) -> System.out.println(nama));
        //dengan lambda blok statement
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });
    }
}


