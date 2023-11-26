
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day49_operatorTernary {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("nilai x : ");
        int x = sc.nextInt();
        System.out.print("nilai y : ");
        int y = sc.nextInt();
        
        int z = x - y;
        
        System.out.println("hasil pengurangan x - y = " + z);
        String hasil = z >= 0? "positif":"negatif";
        System.out.println(hasil);
    }
    
}
