
package pkg100.days.of.coding;

import java.util.Arrays;

public class Day54_array {

    public static void main(String[] args) {
        
        System.out.println("=====array menggunakan for-each=====");
        
        int nilai [] = {11,22,33,44,55};
        
        for (int i : nilai ){
            System.out.println(i);
        }
        
        System.out.println("=====print semua array=====");
        
        String nama [] = new String [3];
        nama[0] = "cinta";
        nama[1] = "pira";
        nama[2] = "pipin";
        System.out.println(Arrays.toString(nama));
    }
    
}
