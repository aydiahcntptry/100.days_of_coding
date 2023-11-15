
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day10_UangBulanan_anakKos {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
        System.out.println("___pengeluaran uang bulanan anak kosan___");
      
        // Meminta input
        System.out.print("Total Masukan: Rp ");
        double TotalMasukan = sc.nextDouble();

        System.out.print("Total Pengeluaran: Rp ");
        double TotalPengeluaran = sc.nextDouble();

        // Menghitung sisa uang 
        double SisaUangBulanIni = TotalMasukan - TotalPengeluaran;

        // Menentukan sisa uang
        if (SisaUangBulanIni >= 0) {
            System.out.println("anda masih memiliki sisa uang.");
        } else {
            System.out.println("pengeluaran anda lebih banyak dari uang masukan.");
        }

        // Menutup Scanner
        sc.close();
    }
}
    
