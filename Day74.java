package pkg100.days.of.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Day74_array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int nilai [][] = new int[3][3];
        int total = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("masukan nilai ke-" + i + " " + j + " : ");
                nilai[i][j] = sc.nextInt();
                total += nilai[i][j];
                
            }

        }
        System.out.println("========================================3");
        System.out.println(Arrays.deepToString(nilai));
        System.out.println("hasil perjumlahan isi array : " + total);
    }
    
}
