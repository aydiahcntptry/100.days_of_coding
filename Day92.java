package pkg100.days.of.coding;

import java.util.Scanner;

public class Day92_ {
    
    static void jumlahkan(int angkaA, int angkaB){
        int angkaC = angkaA + angkaB;
        
        if(angkaC % 2 == 0){
            angkaC +=2;
            System.out.println(angkaA + " + " + angkaB + " = " + angkaC );
        }else{
            angkaC +=1;
            System.out.println(angkaA + " + " + angkaB + " = " + angkaC);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka A : ");
        int angkaA = sc.nextInt();
        
        System.out.print("masukan angka B : ");
        int angkaB = sc.nextInt();
                
        jumlahkan(angkaA,angkaB);
    }
    
}

