
package pkg100.days.of.coding;

public class Day29_pola8 {

    public static void main(String[] args) {
    // belajar pola 8    
    
    int E = 4;

        for (int i = 1; i <= E; i++) {
            for (int j = E; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { 
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
    
