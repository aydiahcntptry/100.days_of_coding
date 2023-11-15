
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day9_nilai_MINdanMIX {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka : ");
        int a = sc.nextInt();
        
        System.out.print("masukan angka : ");
        int b = sc.nextInt();
        
        int min, max;
        
        if(a<b){
            min = a;
            max = b;
            
        }else{
            min = b;
            max = a;
        }
        System.out.println ("nilai Min : " + min);
        System.out.println ("nilai Max : " + max);
    }
    
}
