
package pkg100.days.of.coding;

public class Day37_pola6_dan_pola7 {

    public static void main(String[] args) {
       
        System.out.println("---------");
        System.out.println("pola 6");
        System.out.println("---------");
        
        int S = 5;
        
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------");
        System.out.println("pola 7");
        System.out.println("---------");
        
        int T = 7;
        
        for (int i = T; i >= 0; i--) {
            for (int j = 0; j < T-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
