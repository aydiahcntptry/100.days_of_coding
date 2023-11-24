
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day47_perulanganDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("angkaA : ");
        int A = sc.nextInt();
        System.out.print("angkaB : ");
        int B = sc.nextInt();

        do{
            System.out.print(A);
            if (A % 5 == 3 && A % 3 != 0){
                System.out.println(" kelibatan 5");
            }else{
                System.out.println(" bukan kelibatan 5");
            }
            A++;
                    
        } while (A <= B);
        System.out.println("");
    }
    
}
