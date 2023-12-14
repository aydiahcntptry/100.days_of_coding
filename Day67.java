
package pkg100.days.of.coding;

public class Day67_array {

    public static void main(String[] args) {
        
        int nilai [][] = {
            {23,45,67},
            {32,45,12},
            {45,56,34}
        };
        int jumlah = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                jumlah += nilai[i][j];
            }
        }
        System.out.println("jumlah isi semua array : " + jumlah);
    }
    
}
