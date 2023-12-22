package pkg100.days.of.coding;

import java.util.Scanner;

public class Day75_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int total = 0;
        
        System.out.print("masukan nilai batas : ");
        int nilaiBatas = sc.nextInt();
        
        for (int i = 1; i <= nilaiBatas; i++) {
            System.out.print(i);
            total += i;
            if (i < nilaiBatas){
               System.out.print(" + "); 
            }else{
                System.out.print(" = ");
                System.out.print(total);
        }

        }
        System.out.println("");
    }
    
}
