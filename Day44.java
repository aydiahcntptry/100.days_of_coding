package pkg100.days.of.coding;

import java.util.Scanner;

public class Day44_perulanganWhile {

    public static void main(String[] args) {
           
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=====bilangan genap=====");
        
        int totalA = 0;
        int totalB = 0;
        
        System.out.print("angka awal genap : ");
        int awalA = sc.nextInt();
        System.out.print("angka akhir genap : ");
        int akhirA = sc.nextInt();

        int a = 1;
        while(a <= akhirA){
            int hasil = a % 2;
            if (hasil == 0){
                totalA +=a;
                System.out.print(a);
                if (a < akhirA) {
                    System.out.print(" + ");
                }
            }
            a++;
        }
        System.out.println(" = " + totalA);
        System.out.println("");
        
       System.out.println("=====bilangan ganjil=====");
        
        System.out.print("angka awal ganjil : ");
        int awalB = sc.nextInt();
        System.out.print("angka akhir genjil : ");
        int akhirB = sc.nextInt();

        int b = 1;
        while (b <= akhirB){
            int hasil = b % 2;
            if(hasil == 1){ 
               totalB +=b; 
                System.out.print(b);
                if (b < akhirB -1){
                    System.out.print(" + ");
                }
            }
            b++;
        }
        System.out.print(" = " + totalB);
        System.out.println("");
    }

}
