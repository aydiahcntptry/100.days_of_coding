package pkg100.days.of.coding;

import java.util.Scanner;

public class Day96_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //String Concatenation (Penggabungan String):
        
        System.out.print("Nama depan anda\t\t: ");
        String depan = sc.nextLine();
        
        System.out.print("Nama belakang anda\t: ");
        String belakang = sc.nextLine();
        
        String namaLengkap = depan.concat("").concat(belakang);
        
        System.out.println("Nama lengkap\t\t: " + namaLengkap);
        
        //String Contains (Mengandung):
        
        System.out.println("====================================================================");
        System.out.println("Masukkan nama depan, nama belakang, atau nama lengkap Anda : ");
        String nama = sc.nextLine();

        if (nama.contains(depan) || nama.contains(belakang) || nama.contains(namaLengkap)){
            System.out.println("kondisi teks terpenuhi");
        }else{
            System.out.println("kondisi teks tidak terpenuhi");
    }
    }
    
}

