
package pkg100.days.of.coding;

public class Day19_perulanganFor {

    public static void main(String[] args) {

        int a = 10;
        int b = 1;
        int total = 0;
        
        for (int i = a; i >= b; i--) {
            System.out.print(i);
            total +=i;
            
            if (i>b){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
        }
        System.out.println(total);
    }
    
}
