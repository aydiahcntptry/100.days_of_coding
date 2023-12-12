package pkg100.days.of.coding;

import java.util.Arrays;

public class Day65_array {
    
    public static void main(String[] args) {
        
        int nilai [][] = {
            {70,75,80},
            {85,90,98}
        };
        
        System.out.println("Cara 1. Menggunakan Arrays.deepToString ");
        System.out.println(Arrays.deepToString(nilai));

        System.out.println("Cara 2. Menggunakan cara for");
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println("");
        }

    }
    
}
