
package pkg100.days.of.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Day66_java {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[2][2];
        
        System.out.println("Cara 1. Menggunakan for");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Masukkan angka ke-" + i + " " + j + " : ");
                data[i][j] = sc.nextInt();
            } 
        }       
        System.out.println("Cara 2. Menggunakan Arrays.deepToString untuk seluruh array");
        System.out.println(Arrays.deepToString(data));

    }
    
}
