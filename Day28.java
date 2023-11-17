
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day28_polaAngka {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka : ");
        int nilai = 0;
        int angka = sc.nextInt();
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < i; j++) {
        if(nilai > 9 ) {
            nilai = 0;
        }
                System.out.print(nilai);
                nilai++;
        }
            System.out.println();    
            }
    }
    
}
