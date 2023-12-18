package pkg100.days.of.coding;

import java.util.Scanner;

public class Day71_array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String hari [] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        
        System.out.print("masukan nomor hari(1-7) : ");
        int nomorHari = sc.nextInt();
        if (nomorHari >= 1 && nomorHari <= 7) {
            String namaHari = hari[nomorHari - 1];
            System.out.println("Nama hari untuk nomor " + nomorHari + " adalah: " + namaHari);
        } else {
            System.out.println("Nomor hari tidak valid. Harap masukkan nomor antara 1 - 7");
        }
        sc.close();
    }
}
