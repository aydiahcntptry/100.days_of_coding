
package pkg100.days.of.coding;

import java.util.Arrays;

public class Day64_array {

    public static void main(String[] args) {
        
        int nomor [] = {1,4,6,2,3,9,8,6,10,5};
        String nama [] = {"fira","dea","ima","cinta","alex","kaila","putra","toni","gibra","budi"};
        
        for (int i = 0; i < 10; i++) {
            Arrays.sort(nomor);
            Arrays.sort(nama);
            System.out.println(nomor[i]+ "." + " " + nama[i]);
        }
    }
    
}
