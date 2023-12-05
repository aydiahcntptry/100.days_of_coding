
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day58_array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan jumlah array : ");
        int jumlahElemen = sc.nextInt();
        
        int [] nilaiArray = new int [jumlahElemen];
        
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("elemen ke- " + (i + 0) + " :");
            nilaiArray[i] = sc.nextInt();
        }
        System.out.println("Elemen-elemen dalam array beserta indeksnya:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Indeks ke-" + i + " memiliki nilai: " + nilaiArray[i]);
        }
    }
    
}
