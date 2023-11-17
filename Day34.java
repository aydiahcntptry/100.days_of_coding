
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day34_restoranMawar {

    public static void main(String[] args) {
        /* Restoran Mawar menawarkan diskon sebesar 20% untuk makanan 
           dan minuman pada hari Senin hingga Kamis. Jika seorang pelanggan 
           memesan makanan senilai Rp 150.000 pada hari Rabu, 
           berapakah total tagihan setelah diskon? */
       
        Scanner scan = new Scanner (System.in);
        
        double totalHarga;
        double diskon;
        double totalTagihan;

        System.out.print("Masukkan total harga makanan: ");
        totalHarga = scan.nextDouble();

        if (totalHarga >= 150000) {
            diskon = totalHarga * 0.2;
        } else {
            diskon = 0;
        }

        totalTagihan = totalHarga - diskon;

        System.out.println("Total tagihan setelah diskon: Rp" + totalTagihan);

    }
    
}
    
