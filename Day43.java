
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day43_perulanganWhile {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        System.out.print("angka awal : ");
        int angkaAwal = sc.nextInt();
        System.out.print("angka akhir : ");
        int angkaAkhir = sc.nextInt();
        
        while (angkaAwal <= angkaAkhir){
            System.out.println("angka "+angkaAwal);
            angkaAwal++;
        }
        
    }
    
}
