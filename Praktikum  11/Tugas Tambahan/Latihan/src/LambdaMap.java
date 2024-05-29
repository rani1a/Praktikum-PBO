import java.util.*;
/**
 * Penulis : Rania
 * NIM : 24060122120013
 * Tanggal : 29 Mei 2024
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 */

public class LambdaMap{
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<String, String>();
        mahasiswaMap.put("24060122120013", "Rania");
        mahasiswaMap.put("24060122140149", "Demina Ayunda Chesara");
        mahasiswaMap.put("24060122130097", "Aura Arfannisa Az Zahra");
        mahasiswaMap.put("24060122130049", "Syakira Nada Nirwana");
        //Menggunakan lambda expression untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " " +nama));
        //Menggunakan lambda block statement untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + " " +nama);
        });
    }
}


