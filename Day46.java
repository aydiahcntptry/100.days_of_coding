
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day46_perulanganDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        
        System.out.print("masukan angkaA : ");
        int A = sc.nextInt();
        System.out.print("masukan angkaB : ");
        int B = sc.nextInt();
        
        do {
            System.out.print(A);  
            total +=A;
            A++;
            
            if (A <= B)
                System.out.print(" + ");
            
        }while (A <= B);
        System.out.println(" = " + total);
        System.out.println("");
    }
    
}
