package pkg100.days.of.coding;

import java.util.Scanner;

public class Day83_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int nilai [] = {3,2,1,7,5,8,9,6,5,3,5,7,2,1,9,7,5,4,8,9,0,1,8,};
        System.out.print("masukan nilai yang ingin anda hitung kemunculnya : ");
        int angka = sc.nextInt();
        
        int bilangan = 0;
        for (int i = 0; i < nilai.length; i++) {
           if (nilai[i] == angka){
               bilangan++;
           } 
        }
        System.out.println("jumlah muncul nilai " + angka + " dalam array: " + bilangan);
    }
    
}

