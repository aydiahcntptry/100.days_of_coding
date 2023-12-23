package pkg100.days.of.coding;

import java.util.Scanner;

public class Day76_ {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukan angka : ");
        int angka = sc.nextInt();
        
        while(angka % 2 == 0){
            System.out.println("genap");
            
            System.out.print("masukan angka :");
            angka = sc.nextInt();
            
        while (angka % 2 == 1){
            System.out.println("you and i, end"); 
            break;
        }    
        }
    }
    
}
