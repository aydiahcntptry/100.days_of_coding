
package pkg100.days.of.coding;

public class Day45_perulanganWhile {

    public static void main(String[] args) {
        
        int c = 1;
        int d = 10;
        int total = 0;
        
        while(c <= d){
            System.out.print(c);
            total +=c;
            if (c != d) {
                System.out.print(" + "); 
            }
           c++;
        }
        System.out.println(" = " + total); 
    }
    
}
