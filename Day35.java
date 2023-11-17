
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day35_uangJajan {

    public static void main(String[] args) {
         /* buatlah sebuah program yang menginput pengeluaran uang jajan perhari,
        dengan syarat pengeluaran harus 20000 ribuan.
        */
       
        Scanner sc = new Scanner (System.in);
        
        int uangJajan;
        
        System.out.print("masukan uang jajan perhari : ");
        uangJajan = sc.nextInt();
        
        if (uangJajan >= 20000){
            System.out.println("boros");
        }else{
            System.out.println("hemat");
        
        }    
    }
}

    
