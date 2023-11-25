
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day48_perulanganDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("angkaA : ");
        int A = sc.nextInt();
        System.out.print("angkaB : ");
        int B = sc.nextInt();
        int hasil;
        System.out.println("===PERKALIAN 5===");
        
        do{
            hasil = A*5;
            System.out.println(A + " x 5 = " + hasil);
            A++;
        } while (A <= B);
        System.out.println(" ");           
    }
    
}
