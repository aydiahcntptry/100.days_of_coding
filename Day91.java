package pkg100.days.of.coding;

import java.util.Scanner;

public class Day91_ {
    
    // input angka dan mengetahui angka tersebut genap atau ganjil
    
    public static void GenapGanjil(int angka){
        if(angka % 2 == 0){
            System.out.println(angka + " adalah bilangan Genap");
        }else{  
            System.out.println(angka + " adalah bilangan Ganjil");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("masukan angka : ");
        int angka = sc.nextInt();
        GenapGanjil(angka);
    }
    
}
