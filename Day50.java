
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day50_OperatorTernary {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka a : ");
        int angka = sc.nextInt();
        
        int b = angka % 2;
        
        System.out.println("angka a % 2 = " + b);
        String hasil = b == 0? "genap":"ganjil";
        System.out.println(hasil);
    }
    
}
