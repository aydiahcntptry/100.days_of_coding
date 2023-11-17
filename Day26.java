
package pkg100.days.of.coding;

public class Day26_pola10 {

    public static void main(String[] args) {
          // latihan pola 10
          
        int x = 10;
        int y = x / 2;
        for (int i = 1; i <= x; i++) {
            if (i <= y) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");          
                }
            }else{
                for (int j = 1; j <= x - i + 1; j++) {
                    System.out.print("* ");
                    
                }
            }
            System.out.println();
             
        }
    
    }
    
}
