
package pkg100.days.of.coding;

public class Day31_pola11 {

    public static void main(String[] args) {
        // belajar buat pola 11 :)
        
        int angka = 6;
        
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka - i; j++) {
                System.out.print("* ");  
            }
            System.out.println();      
        }
        for (int k = 1; k < angka; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
        
       }
            
     }
       
