package pkg100.days.of.coding;

import java.util.Scanner;

public class Day98_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====BIODATA MAHASISWA=====");
        
        System.out.print("Masukan nama \t\t: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukan NIM \t\t: ");
        String nim = sc.nextLine();
        
        System.out.print("Masukan angkatan \t: ");
        int angkatan = sc.nextInt();

        
        String infoMahasiswa = String.format("Nama : %s, NIM : %s, Angkatan : %d",
                nama, nim, angkatan);
        
        System.out.println("==============================================");
        
        System.out.println("Informasi Mahasiswa \n" + infoMahasiswa);

    }
    
}
