package pkg100.days.of.coding;

public class Day73_array {

    public static void main(String[] args) {
               
        int nilai [][] = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };
        int total = 1;
        
        System.out.println("Hanya mencetak nilai genap");
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] % 2 != 1){
                    total *= nilai[i][j];
                    System.out.println(nilai[i][j] + " ");
                }
                
            }
            
        }
        System.out.println("Total perkalian nilai array genap : " + total);

    }
    
}
