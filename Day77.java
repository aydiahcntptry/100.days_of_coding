package pkg100.days.of.coding;

import java.util.Scanner;

public class Day77_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukan nilai a : ");
        int a = sc.nextInt();
        System.out.print("massukan nilai b : ");
        int b = sc.nextInt();
        
        int total = a+b;
        
        if(total % 2 == 0){
            total +=1;
            System.out.println("hasil : " + total);
        }else if (total % 2 == 1){
            total +=2;
            System.out.println("hasil : " + total);
        }
    }
    
}
