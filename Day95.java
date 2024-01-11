package pkg100.days.of.coding;

import java.util.Scanner;

public class Day95_ {
    
    public static void main(String[] args) {
        
        // input teks
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan sebuah teks \t: ");
        String teks = sc.nextLine();
        
        // cetak teks yang input dalam huruf kecil
        String hurufKecil = teks.toLowerCase(); 
        System.out.println("teks dalam huruf kecil \t: " + hurufKecil);
        
        // cetak teks yang input dalam huruf kapital
        String hurufKapital = teks.toUpperCase();
        System.out.println("teks dalam huruf besar \t: " + hurufKapital);
    }
    
}
